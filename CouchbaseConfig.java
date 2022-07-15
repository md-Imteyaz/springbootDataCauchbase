package com.SpringbootCouchbase.CouchbaseConfig;

import org.springframework.data.couchbase.config.AbstractCouchbaseConfiguration;

public class CouchbaseConfig extends AbstractCouchbaseConfiguration {

	@Override
	public String getConnectionString() {
		return "couchbase://127.0.01";
	}

	@Override
	public String getUserName() {
		return "imteyaz";
	}

	@Override
	public String getPassword() {
		return "Neyaz@12345";
	}

	@Override
	public String getBucketName() {
		return "MynewBucket";
	}

}
