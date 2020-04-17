package io.openems.edge.battery.bydcommercial;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@ObjectClassDefinition( //
		name = "Byd.BatteryBox.Commercial.C130", //
		description = "Implements the Byd Commercial C130 battery rack system.")
public @interface Config {

	@AttributeDefinition(name = "Component-ID", description = "Unique ID of this Component")
	String id() default "bms0";

	@AttributeDefinition(name = "Alias", description = "Human-readable name of this Component; defaults to Component-ID")
	String alias() default "";

	@AttributeDefinition(name = "Is enabled?", description = "Is this Component enabled?")
	boolean enabled() default true;

	@AttributeDefinition(name = "Is switched On?", description = "Should this Component be switched on?")
	boolean switchedOn() default true;

	@AttributeDefinition(name = "Modbus-ID", description = "ID of Modbus brige.")
	String modbus_id() default "modbus0";

	@AttributeDefinition(name = "Modbus Unit-ID", description = "The Unit-ID of the Modbus device.")
	int modbusUnitId() default 0;

	@AttributeDefinition(name = "Number of slaves", description = "The number of slaves in this battery rack (max. 20)", min = "1", max = "20")
	int numberOfSlaves() default 20;

	@AttributeDefinition(name = "Error Level 2 Delay", description = "Sets the delay time in seconds how long the system should be stopped after an error level 2 has occurred")
	int errorLevel2Delay() default 600;

	@AttributeDefinition(name = "Start Not Successful Delay Time", description = "Sets the delay time in seconds how long the system should be stopped if it was not able to start")
	int startUnsuccessfulDelay() default 3600;

	@AttributeDefinition(name = "Watchdog", description = "Watchdog timeout in seconds")
	int watchdog() default 60;

	@AttributeDefinition(name = "Pending Tolerance", description = "time in seconds, that is waited if system status cannot be determinated e.g. in case of reading errors")
	int pendingTolerance() default 15;

	@AttributeDefinition(name = "SoC Low Alarm", description = "Sets the value for BMS SoC protection (0..100)", min = "0", max = "100")
	int SocLowAlarm() default 0;

	@AttributeDefinition(name = "Minimal Cell Voltage Millivolt", description = "Minimal cell voltage in milli volt when system does not allow further discharging")
	int minimalCellVoltage() default 2800;

	@AttributeDefinition(name = "Modbus target filter", description = "This is auto-generated by 'Modbus-ID'.")
	String Modbus_target() default "";

	String webconsole_configurationFactory_nameHint() default "BYD BatteryBox Commercial C130[{id}]";
}