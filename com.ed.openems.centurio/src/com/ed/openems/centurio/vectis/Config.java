package com.ed.openems.centurio.vectis;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@ObjectClassDefinition( //
		name = "KACO Vectis", //
		description = "Implements the KACO Vectis component.")
@interface Config {
	String service_pid();

	String id() default "meter0";

	boolean enabled() default true;

	@AttributeDefinition(name = "EdCom-ID", description = "ID of EdCom Interface.")
	String datasource_id() default "edcom0";
	
	

	String webconsole_configurationFactory_nameHint() default "KACO Centurio Vectis[{id}]";
}
