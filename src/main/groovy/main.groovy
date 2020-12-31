class Test {
    static void main(String[] args) {
        // Using a simple println statement to print output to the console
        println('Hello World');
        println(("grant_type=refresh_token&redirect_uri=https%3A%2F%2Fgithub.gapinc.com%2Fpages%2Fvbarbos%2Flinkbuilder%2Fopenid-connect%2Fcallback-handler.html&refresh_token=\"+refreshToken").asJson())
    }
}