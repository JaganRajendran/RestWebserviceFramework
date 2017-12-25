# This framework helps to create a web service provider by configuring in just three steps.
All you need to do is configure the request parameter in first step ccarefully.
1. Request Parameter should extend RequestMasterObjectI
	a. getSTP(StoredProcedures to be invoked)
	b. getProperties (properties that will be passed to the storedprocedure)
	c. getPropertiesForSpecialCaseHandling(not needed now, it is for future)
	d. getResponseObj(Corresponding response object)
2. Response Parameter should extend ResponseMasterObjectI
	a. setProperties(properties to be return to the caller)
3. Service.
	Java class to be mapped for the webservice url.
	e.g
		@POST
    @Produces("application/json")
    @Consumes("application/json")
    public String putJson(String content) {
		/*Request parameter to be mapped.*/
        LoginParam loginParam=(LoginParam)JsonUtilities.convertJsonToObj(content, LoginParam.class);
        DBCommunicator dbComm=new DBCommunicator();     
        return dbComm.getJsonResponseForService(loginParam);
    } 

This framework was designed with an assumption that the backend database uses storeprocedure. 

In addition to this, this project also contains the GCM(Google Communication Messaging)
and APNS(Android Push Notifications)

Dependencies: javax,GoogleGCM,APNS