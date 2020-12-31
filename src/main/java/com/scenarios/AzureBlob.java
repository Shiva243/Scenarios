package com.scenarios;

import com.microsoft.azure.storage.AccessCondition;
import com.microsoft.azure.storage.CloudStorageAccount;
import com.microsoft.azure.storage.StorageException;
import com.microsoft.azure.storage.blob.*;

import java.io.IOException;
import java.net.URISyntaxException;
import java.security.InvalidKeyException;
import java.util.Calendar;
import java.util.Date;

public class AzureBlob {
    public static void main(String[] args) throws StorageException, URISyntaxException, IOException {
       // createBlob("TEST0567");
        //deleteOrderAuditDetails("");
        //getBlobContainer().delete(AccessCondition.generateIfModifiedSinceCondition(new Date()), new BlobRequestOptions(),null);
        //deleteOrderAuditDetails("");
        getBlobsDirectory();
    }

    private static CloudBlobContainer getBlobContainer() {
        String storageAccountName = "auditeventstoragetest";
        String storageAccountKey = "L5nncKTf4MA2gvOOJqUnzj+7cTeljdqH2pV6XWiqdCdEdlF+04FAwjLZJCuEUgKzjgBla3RLPHmtl/B+eH4hsw==";
        String storageContainerName = "orders-change-log";
        CloudBlobContainer container = null;
        try {
            String storageConnectionString = "DefaultEndpointsProtocol=https;AccountName="
                    + storageAccountName + ";AccountKey=" + storageAccountKey;
            System.out.println("Url [" + storageConnectionString + "]");
            CloudStorageAccount storageAccount = null;
            storageAccount = CloudStorageAccount.parse(storageConnectionString);
            CloudBlobClient blobClient = storageAccount.createCloudBlobClient();
            container = blobClient.getContainerReference(storageContainerName);
            container.createIfNotExists();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        } catch (InvalidKeyException e) {
            e.printStackTrace();
        } catch (StorageException e) {
            e.printStackTrace();
        }
        System.out.println("container [" + container + "]");
        return container;
    }

    private static void createBlob(String orderId) throws StorageException, URISyntaxException, IOException {
        CloudBlockBlob blob = getBlobContainer().getBlockBlobReference(orderId);
        blob.uploadText("test");
    }

    private static void getBlobs() {
        CloudBlobContainer container = getBlobContainer();
        Date d = container.getProperties().getLastModified();
        Iterable<ListBlobItem> blobItem = container.listBlobs();
        blobItem.forEach(listBlobItem -> {
            try {
                CloudAppendBlob b = (CloudAppendBlob) listBlobItem;
                Date date = b.getProperties().getLastModified();
                Calendar cal = Calendar.getInstance();
                cal.setTime(new Date());
                cal.add(Calendar.DATE, -8);
               // System.out.println("check Date"+cal.getTime());
                if (cal.getTime().after(date)) {
                    System.out.println("Name [" + b.getName() + "] date [" + date + "]["+cal.getTime()+"]");
                   // b.deleteIfExists();
                }
            } catch (URISyntaxException e) {
                e.printStackTrace();
            }
        });

    }

    private static void getBlobsDirectory() throws StorageException{
        CloudBlobContainer container = getBlobContainer();
        Date d = container.getProperties().getLastModified();
        Iterable<ListBlobItem> blobItem = container.listBlobs("ST");
        blobItem.forEach(listBlobItem -> {
            try {
                CloudBlobDirectory b = (CloudBlobDirectory) listBlobItem;
                System.out.print("URI ["+b.getUri()+"]");
                deleteFolder(""+b.getPrefix(),container);
              //  b.ge.delete();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

    }

    public static void deleteFolder(String folder, CloudBlobContainer container) throws StorageException, URISyntaxException {
        for (ListBlobItem blobItem : container.listBlobs(folder)) {
            if (blobItem instanceof CloudBlockBlob) {
                CloudBlockBlob blob = (CloudBlockBlob) blobItem;
               Date date= blob.getProperties().getLastModified();
               boolean value = blob.deleteIfExists();
                System.out.println("value ["+value+"] date ["+date);
            } else {
                if (blobItem instanceof CloudBlobDirectory)
                    deleteFolder(((CloudBlobDirectory) blobItem).getPrefix(), container);
            }
        }
    }
    public static Boolean deleteOrderAuditDetails(final String orderId) {
        Boolean deletedAudit = Boolean.FALSE;
        try {
            Date date = new Date("04/18/209");
            getBlobContainer().delete(AccessCondition.generateIfModifiedSinceCondition(new Date()), new BlobRequestOptions(),null);
            //  log.info(""+blobContainer.getProperties().getLastModified().getTime());
            //deletedAudit = blobContainer.getBlockBlobReference(orderId).deleteIfExists();
        } catch(StorageException sExp) {
            //throw new NotFoundException(sExp.getHttpStatusCode(), sExp.getMessage());
        } /*catch(URISyntaxException exp) {
            exp.printStackTrace();
        }*/
        return deletedAudit;
    }
}
