package org.raml.schema.model;

import java.util.List;
import java.util.Map;

public interface ISchemaType {
	
	Map<String,String> getNamespaces();
	
	String getName();
	
	boolean isSimple();
	
	boolean isComplex();
	
	List<ISchemaProperty> getProperties();
	
	String getQualifiedPropertyName(ISchemaProperty prop);
}
