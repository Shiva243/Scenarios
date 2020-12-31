import java.security.InvalidKeyException
import java.util.{Base64, Calendar}
import java.net.URLEncoder
import java.nio.charset.StandardCharsets
import java.text.SimpleDateFormat

import javax.crypto.Mac
import javax.crypto.spec.SecretKeySpec

import scala.util.Random

object SignGen {

  def main(args: Array[String]): Unit = {
    // getAccessToken("https://orderevents-ns.servicebus.windows.net/orderevents", "RootManageSharedAccessKey", "y/2WycnftbFTyqknqGbU3ucFyUU5Ho4Eqm7BkiINaf0=")
    //val r = Random.alphanumeric
    //val x = List.range(1, 3)
   // x.foreach( )
    //2019-01-16T20:58:57
    print(new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss").format(Calendar.getInstance().getTime()))

  }
  def getAccessToken(resourceUri: String, keyName: String, key: String): String = {
    val epoch: Long = (System.currentTimeMillis / 1000L)+(60 * 60 * 24 * 7)
    val week: Int = 60 * 60 * 24 * 7
    val expiry: String = epoch.toString
    var sasToken: String = ""
    val stringToSign: String = URLEncoder.encode(resourceUri, StandardCharsets.UTF_8.toString) + "\n" + expiry
    val signature: String = generateHMAC(key, stringToSign)
    sasToken = "SharedAccessSignature sr=" + URLEncoder.encode(resourceUri, "UTF-8") + "&sig=" + URLEncoder.encode(signature, "UTF-8") + "&se=" + expiry + "&skn=" + keyName
    println(sasToken)
    return sasToken
  }

  def generateHMAC(sharedSecret: String, input: String): String = {
    val secret = new SecretKeySpec(sharedSecret.getBytes, "HmacSHA256")   //Crypto Funs : 'SHA256' , 'HmacSHA1'
    val mac:Mac = Mac.getInstance("HmacSHA256")
    mac.init(secret)
    val encoder: Base64.Encoder = Base64.getEncoder
     new String(encoder.encode(mac.doFinal(input.getBytes("UTF-8"))))
    //val hashString: Array[Byte] = mac.doFinal(preHashString.getBytes)
   // new String(hashString.map(_.toChar))
  }
}
