Simple Restlet Sample - Hello World!
----------------------------------
1.  Install Maven and Java
2.  On the Root Directory run  "mvn clean install"
3.  Then run "mvn tomcat:run-war" to startup the server
4.  You can access the webapp with:  

     http://localhost:8080/hnl-restlet-sample/hello
     
Output from the Web Browser should say:  

Hello World!


Sample Console Output:
=====================
INFO: basecamp: [Restlet] Attaching restlet: com.hnl.restlet.sample.BaseCampApplication@7615b758 to URI: /hnl-restlet-sample
INFO: 2012-11-10	00:09:54	127.0.0.1	-	127.0.0.1	8080	GET	/hnl-restlet-sample/hello	-	200	12	0	57	http://localhost:8080	Mozilla/5.0 (Macintosh; Intel Mac OS X 10_6_8) AppleWebKit/537.11 (KHTML, like Gecko) Chrome/23.0.1271.64 Safari/537.11	-
  