package com.ihg.search.seachApp;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class DecisionTableSearch {

	private static String gdst1 = "<decision-table52>\n" + "  <tableName>Fee_Booking</tableName>\n" + "\n"
			+ "  <rowNumberCol>\n" + "    <hideColumn>false</hideColumn>\n" + "    <width>50</width>\n"
			+ "  </rowNumberCol>\n" + "\n" + "  <descriptionCol>\n" + "    <hideColumn>false</hideColumn>\n"
			+ "    <width>150</width>\n" + "  </descriptionCol>\n" + "\n" + "  <metadataCols/>\n" + "\n"
			+ "  <attributeCols>\n" + "    <attribute-column52>\n" + "      \n" + "      <typedDefaultValue>\n"
			+ "        <valueString></valueString>\n" + "        <dataType>STRING</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </typedDefaultValue>\n" + "\n"
			+ "      <hideColumn>false</hideColumn>\n" + "      <width>100</width>\n"
			+ "      <attribute>ruleflow-group</attribute>\n" + "      <reverseOrder>false</reverseOrder>\n"
			+ "      <useRowNumber>false</useRowNumber>\n" + "\n" + "    </attribute-column52>\n" + "\n" + "\n"
			+ "    <attribute-column52>\n" + "\n" + "      <typedDefaultValue>\n"
			+ "        <valueNumeric class=\"int\">0</valueNumeric>\n" + "        <valueString></valueString>\n"
			+ "        <dataType>NUMERIC_INTEGER</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </typedDefaultValue>\n" + "\n" + "      <hideColumn>false</hideColumn>\n"
			+ "      <width>100</width>\n" + "      <attribute>salience</attribute>\n"
			+ "      <reverseOrder>false</reverseOrder>\n" + "      <useRowNumber>false</useRowNumber>\n" + "\n"
			+ "    </attribute-column52>\n" + "\n" + "\n" + "    <attribute-column52>\n" + "\n"
			+ "      <typedDefaultValue>\n" + "        <valueBoolean>false</valueBoolean>\n"
			+ "        <valueString></valueString>\n" + "        <dataType>BOOLEAN</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </typedDefaultValue>\n"
			+ "      <hideColumn>true</hideColumn>\n" + "      <width>100</width>\n"
			+ "      <attribute>enabled</attribute>\n" + "      <reverseOrder>false</reverseOrder>\n"
			+ "      <useRowNumber>false</useRowNumber>\n" + "      \n" + "    </attribute-column52>\n" + "\n"
			+ "  </attributeCols>\n" + "\n" + "\n" + "\n" + "  <conditionPatterns>\n" + "    \n" + "    <Pattern52>\n"
			+ "      <factType>Reservation</factType>\n" + "      <boundName>reservation</boundName>\n"
			+ "      <isNegated>false</isNegated>\n" + "      \n" + "      <conditions>\n" + "        \n"
			+ "        <condition-column52>\n" + "          <typedDefaultValue>\n"
			+ "            <valueBoolean>true</valueBoolean>\n" + "            <valueString></valueString>\n"
			+ "            <dataType>BOOLEAN</dataType>\n" + "            <isOtherwise>false</isOtherwise>\n"
			+ "          </typedDefaultValue>\n" + "          <hideColumn>true</hideColumn>\n"
			+ "          <width>100</width>\n" + "          <header>FeeEligibility</header>\n"
			+ "          <constraintValueType>1</constraintValueType>\n"
			+ "          <factField>feeEligibility</factField>\n" + "          <fieldType>Boolean</fieldType>\n"
			+ "          <operator>==</operator>\n" + "          <parameters/>\n" + "          <binding></binding>\n"
			+ "        </condition-column52>\n" + "        \n" + "        <condition-column52>\n"
			+ "          <typedDefaultValue>\n" + "            <valueString></valueString>\n"
			+ "            <dataType>STRING</dataType>\n" + "            <isOtherwise>false</isOtherwise>\n"
			+ "          </typedDefaultValue>\n" + "          <hideColumn>false</hideColumn>\n"
			+ "          <width>100</width>\n" + "          <header>TC_Part</header>\n"
			+ "          <constraintValueType>1</constraintValueType>\n"
			+ "          <factField>travelConsultParticipationCode</factField>\n"
			+ "          <fieldType>String</fieldType>\n" + "          <operator>in</operator>\n"
			+ "          <parameters/>\n" + "          <binding></binding>\n" + "        </condition-column52>\n"
			+ "        \n" + "        <condition-column52>\n" + "          <typedDefaultValue>\n"
			+ "            <valueString></valueString>\n" + "            <dataType>STRING</dataType>\n"
			+ "            <isOtherwise>false</isOtherwise>\n" + "          </typedDefaultValue>\n"
			+ "          <hideColumn>false</hideColumn>\n" + "          <width>100</width>\n"
			+ "          <header>TC_Cat</header>\n" + "          <constraintValueType>1</constraintValueType>\n"
			+ "          <factField>travelConsultCategory</factField>\n" + "          <fieldType>String</fieldType>\n"
			+ "          <operator>in</operator>\n" + "          <parameters/>\n" + "          <binding></binding>\n"
			+ "        </condition-column52>\n" + "        \n" + "        <condition-column52>\n"
			+ "          <typedDefaultValue>\n" + "            <valueString></valueString>\n"
			+ "            <dataType>STRING</dataType>\n" + "            <isOtherwise>false</isOtherwise>\n"
			+ "          </typedDefaultValue>\n" + "          <hideColumn>false</hideColumn>\n"
			+ "          <width>100</width>\n" + "          <header>TCID#</header>\n"
			+ "          <constraintValueType>1</constraintValueType>\n"
			+ "          <factField>travelConsultId</factField>\n" + "          <fieldType>String</fieldType>\n"
			+ "          <operator>in</operator>\n" + "          <parameters/>\n" + "          <binding></binding>\n"
			+ "        </condition-column52>\n" + "        \n" + "        <condition-column52>\n"
			+ "          <typedDefaultValue>\n" + "            <valueString></valueString>\n"
			+ "            <dataType>STRING</dataType>\n" + "            <isOtherwise>false</isOtherwise>\n"
			+ "          </typedDefaultValue>\n" + "          <hideColumn>false</hideColumn>\n"
			+ "          <width>100</width>\n" + "          <header>Sell_Chan</header>\n"
			+ "          <constraintValueType>1</constraintValueType>\n"
			+ "          <factField>origSellChannel</factField>\n" + "          <fieldType>String</fieldType>\n"
			+ "          <operator>in</operator>\n" + "          <parameters/>\n" + "          <binding></binding>\n"
			+ "        </condition-column52>\n" + "        \n" + "        <condition-column52>\n"
			+ "          <typedDefaultValue>\n" + "            <valueString></valueString>\n"
			+ "            <dataType>STRING</dataType>\n" + "            <isOtherwise>false</isOtherwise>\n"
			+ "          </typedDefaultValue>\n" + "          <hideColumn>false</hideColumn>\n"
			+ "          <width>100</width>\n" + "          <header>Sell_Source</header>\n"
			+ "          <constraintValueType>1</constraintValueType>\n"
			+ "          <factField>origSellSource</factField>\n" + "          <fieldType>String</fieldType>\n"
			+ "          <operator>in</operator>\n" + "          <valueList></valueList>\n"
			+ "          <parameters/>\n" + "          <binding></binding>\n" + "        </condition-column52>\n"
			+ "       \n" + "        <condition-column52>\n" + "          <typedDefaultValue>\n"
			+ "            <valueString></valueString>\n" + "            <dataType>STRING</dataType>\n"
			+ "            <isOtherwise>false</isOtherwise>\n" + "          </typedDefaultValue>\n"
			+ "          <hideColumn>false</hideColumn>\n" + "          <width>100</width>\n"
			+ "          <header>EXCL_CorpAcct</header>\n" + "          <constraintValueType>1</constraintValueType>\n"
			+ "          <factField>corpAcctNum</factField>\n" + "          <fieldType>String</fieldType>\n"
			+ "          <operator>not in</operator>\n" + "          <parameters/>\n"
			+ "          <binding></binding>\n" + "        </condition-column52>\n" + "        \n"
			+ "        <condition-column52>\n" + "          <typedDefaultValue>\n"
			+ "            <valueString></valueString>\n" + "            <dataType>STRING</dataType>\n"
			+ "            <isOtherwise>false</isOtherwise>\n" + "          </typedDefaultValue>\n"
			+ "          <hideColumn>false</hideColumn>\n" + "          <width>100</width>\n"
			+ "          <header>RateCat</header>\n" + "          <constraintValueType>1</constraintValueType>\n"
			+ "          <factField>rateCategory</factField>\n" + "          <fieldType>String</fieldType>\n"
			+ "          <operator>in</operator>\n" + "          <parameters/>\n" + "          <binding></binding>\n"
			+ "        </condition-column52>\n" + "      \n" + "      </conditions>\n" + "      \n" + "      <window>\n"
			+ "        <parameters/>\n" + "      </window>\n" + "\n" + "      <entryPointName></entryPointName>\n"
			+ "\n" + "    </Pattern52>\n" + "\n" + "  </conditionPatterns>\n" + "\n" + "\n" + "\n" + "\n"
			+ "  <actionCols>\n" + "    \n" + "    <set-field-col52>\n" + "      <typedDefaultValue>\n"
			+ "        <valueString></valueString>\n" + "        <dataType>NUMERIC_BIGDECIMAL</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </typedDefaultValue>\n"
			+ "      <hideColumn>false</hideColumn>\n" + "      <width>100</width>\n"
			+ "      <header>GDS Fee</header>\n" + "      <boundName>reservation</boundName>\n"
			+ "      <factField>gdsFeeAmt</factField>\n" + "      <type>BigDecimal</type>\n"
			+ "      <update>false</update>\n" + "    </set-field-col52>\n" + "    \n" + "    <set-field-col52>\n"
			+ "      <typedDefaultValue>\n" + "        <valueString></valueString>\n"
			+ "        <dataType>NUMERIC_BIGDECIMAL</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </typedDefaultValue>\n" + "      <hideColumn>false</hideColumn>\n" + "      <width>100</width>\n"
			+ "      <header>XML Fee</header>\n" + "      <boundName>reservation</boundName>\n"
			+ "      <factField>xmlFeeAmt</factField>\n" + "      <type>BigDecimal</type>\n"
			+ "      <update>false</update>\n" + "    </set-field-col52>\n" + "    \n" + "    <set-field-col52>\n"
			+ "      <typedDefaultValue>\n" + "        <valueString></valueString>\n"
			+ "        <dataType>NUMERIC_BIGDECIMAL</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </typedDefaultValue>\n" + "      <hideColumn>false</hideColumn>\n" + "      <width>100</width>\n"
			+ "      <header>Concur Fee</header>\n" + "      <boundName>reservation</boundName>\n"
			+ "      <factField>concurFeeAmt</factField>\n" + "      <type>BigDecimal</type>\n"
			+ "      <update>false</update>\n" + "    </set-field-col52>\n" + "\n" + "  </actionCols>\n" + "\n" + "\n"
			+ "  <auditLog>\n"
			+ "    <filter class=\"org.drools.guvnor.client.modeldriven.dt52.auditlog.DecisionTableAuditLogFilter\">\n"
			+ "      <acceptedTypes>\n" + "        <entry>\n" + "          <string>INSERT_ROW</string>\n"
			+ "          <boolean>false</boolean>\n" + "        </entry>\n" + "        <entry>\n"
			+ "          <string>INSERT_COLUMN</string>\n" + "          <boolean>false</boolean>\n"
			+ "        </entry>\n" + "        <entry>\n" + "          <string>DELETE_ROW</string>\n"
			+ "          <boolean>false</boolean>\n" + "        </entry>\n" + "        <entry>\n"
			+ "          <string>DELETE_COLUMN</string>\n" + "          <boolean>false</boolean>\n"
			+ "        </entry>\n" + "        <entry>\n" + "          <string>UPDATE_COLUMN</string>\n"
			+ "          <boolean>false</boolean>\n" + "        </entry>\n" + "      </acceptedTypes>\n"
			+ "    </filter>\n" + "    <entries/>\n" + "  </auditLog>\n" + "\n" + "  <imports>\n" + "    <imports>\n"
			+ "      <org.kie.soup.project.datamodel.imports.Import>\n"
			+ "        <type>com.ihg.ics.rules.model.Reservation</type>\n"
			+ "      </org.kie.soup.project.datamodel.imports.Import>\n" + "    </imports>\n" + "  </imports>\n" + "\n"
			+ "  <packageName>com.ihg.bitbucket</packageName>\n" + "  <tableFormat>EXTENDED_ENTRY</tableFormat>\n"
			+ "  <hitPolicy>NONE</hitPolicy>\n" + "\n" + "  <data>\n" + "    <list>\n" + "      <value>\n"
			+ "        <valueNumeric class=\"int\">1</valueNumeric>\n" + "        <valueString></valueString>\n"
			+ "        <dataType>NUMERIC_INTEGER</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "\n" + "      <value>\n" + "        <valueString>GDS</valueString>\n"
			+ "        <dataType>STRING</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "\n" + "      <value>\n" + "        <valueString>Fee</valueString>\n"
			+ "        <dataType>STRING</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "\n" + "      <value>\n" + "        <valueNumeric class=\"int\">300</valueNumeric>\n"
			+ "        <valueString></valueString>\n" + "        <dataType>NUMERIC_INTEGER</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </value>\n" + "\n" + "      <value>\n"
			+ "        <valueBoolean>true</valueBoolean>\n" + "        <valueString></valueString>\n"
			+ "        <dataType>BOOLEAN</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "\n" + "      <value>\n" + "        <valueBoolean>true</valueBoolean>\n"
			+ "        <valueString></valueString>\n" + "        <dataType>BOOLEAN</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </value>\n" + "\n" + "      <value>\n"
			+ "        <valueString></valueString>\n" + "        <dataType>STRING</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </value>\n" + "\n" + "      <value>\n"
			+ "        <valueString></valueString>\n" + "        <dataType>STRING</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </value>\n" + "\n" + "      <value>\n"
			+ "        <valueString></valueString>\n" + "        <dataType>STRING</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </value>\n" + "\n" + "      <value>\n"
			+ "        <valueString>GDS</valueString>\n" + "        <dataType>STRING</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </value>\n" + "\n" + "      <value>\n"
			+ "        <valueString></valueString>\n" + "        <dataType>STRING</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </value>\n" + "\n" + "      <value>\n"
			+ "        <valueString></valueString>\n" + "        <dataType>STRING</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </value>\n" + "\n" + "      <value>\n"
			+ "        <valueString></valueString>\n" + "        <dataType>STRING</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </value>\n" + "\n" + "      <value>\n"
			+ "        <valueNumeric>6.40</valueNumeric>\n" + "        <valueString></valueString>\n"
			+ "        <dataType>NUMERIC_BIGDECIMAL</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "\n" + "      <value>\n" + "        <valueString></valueString>\n"
			+ "        <dataType>NUMERIC_BIGDECIMAL</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "\n" + "      <value>\n" + "        <valueString></valueString>\n"
			+ "        <dataType>NUMERIC_BIGDECIMAL</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "\n" + "    </list>\n" + "\n" + "    <list>\n" + "\n" + "      <value>\n"
			+ "        <valueNumeric class=\"int\">2</valueNumeric>\n" + "        <valueString></valueString>\n"
			+ "        <dataType>NUMERIC_INTEGER</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "\n" + "      <value>\n" + "        <valueString>XML</valueString>\n"
			+ "        <dataType>STRING</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "\n" + "      <value>\n" + "        <valueString>Fee</valueString>\n"
			+ "        <dataType>STRING</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "\n" + "      <value>\n" + "        <valueNumeric class=\"int\">300</valueNumeric>\n"
			+ "        <valueString></valueString>\n" + "        <dataType>NUMERIC_INTEGER</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </value>\n" + "\n" + "      <value>\n"
			+ "        <valueBoolean>true</valueBoolean>\n" + "        <valueString></valueString>\n"
			+ "        <dataType>BOOLEAN</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "\n" + "      <value>\n" + "        <valueBoolean>true</valueBoolean>\n"
			+ "        <valueString></valueString>\n" + "        <dataType>BOOLEAN</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </value>\n" + "\n" + "      <value>\n"
			+ "        <valueString>PART,FEE</valueString>\n" + "        <dataType>STRING</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </value>\n" + "\n" + "      <value>\n"
			+ "        <valueString></valueString>\n" + "        <dataType>STRING</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </value>\n" + "\n" + "      <value>\n"
			+ "        <valueString>96029496, 96029511, 96029544, 96060204</valueString>\n"
			+ "        <dataType>STRING</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "\n" + "      <value>\n" + "        <valueString>WEB,OFC</valueString>\n"
			+ "        <dataType>STRING</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "\n" + "      <value>\n" + "        <valueString></valueString>\n"
			+ "        <dataType>STRING</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "\n" + "      <value>\n" + "        <valueString></valueString>\n"
			+ "        <dataType>STRING</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "\n" + "      <value>\n" + "        <valueString></valueString>\n"
			+ "        <dataType>STRING</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "\n" + "      <value>\n" + "        <valueString></valueString>\n"
			+ "        <dataType>NUMERIC_BIGDECIMAL</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "\n" + "      <value>\n" + "        <valueNumeric>1.75</valueNumeric>\n"
			+ "        <valueString></valueString>\n" + "        <dataType>NUMERIC_BIGDECIMAL</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </value>\n" + "\n" + "      <value>\n"
			+ "        <valueString></valueString>\n" + "        <dataType>NUMERIC_BIGDECIMAL</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </value>\n" + "\n" + "    </list>\n" + "    \n"
			+ "    <list>\n" + "\n" + "      <value>\n" + "        <valueNumeric class=\"int\">3</valueNumeric>\n"
			+ "        <valueString></valueString>\n" + "        <dataType>NUMERIC_INTEGER</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </value>\n" + "\n" + "      <value>\n"
			+ "        <valueString>Concur</valueString>\n" + "        <dataType>STRING</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </value>\n" + "\n" + "      <value>\n"
			+ "        <valueString>Fee</valueString>\n" + "        <dataType>STRING</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </value>\n" + "\n" + "      <value>\n"
			+ "        <valueNumeric class=\"int\">300</valueNumeric>\n" + "        <valueString></valueString>\n"
			+ "        <dataType>NUMERIC_INTEGER</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "\n" + "      <value>\n" + "        <valueBoolean>true</valueBoolean>\n"
			+ "        <valueString></valueString>\n" + "        <dataType>BOOLEAN</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </value>\n" + "\n" + "      <value>\n"
			+ "        <valueBoolean>true</valueBoolean>\n" + "        <valueString></valueString>\n"
			+ "        <dataType>BOOLEAN</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "\n" + "      <value>\n" + "        <valueString></valueString>\n"
			+ "        <dataType>STRING</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "\n" + "      <value>\n" + "        <valueString>CR</valueString>\n"
			+ "        <dataType>STRING</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "      <value>\n" + "        <valueString></valueString>\n"
			+ "        <dataType>STRING</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "\n" + "      <value>\n" + "        <valueString></valueString>\n"
			+ "        <dataType>STRING</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "\n" + "      <value>\n" + "        <valueString>WEBWB, WEBMB</valueString>\n"
			+ "        <dataType>STRING</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "      <value>\n" + "        <valueString>12345</valueString>\n"
			+ "        <dataType>STRING</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "\n" + "      <value>\n" + "        <valueString></valueString>\n"
			+ "        <dataType>STRING</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "\n" + "      <value>\n" + "        <valueString></valueString>\n"
			+ "        <dataType>NUMERIC_BIGDECIMAL</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "\n" + "      <value>\n" + "        <valueString></valueString>\n"
			+ "        <dataType>NUMERIC_BIGDECIMAL</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "      <value>\n" + "        <valueNumeric>2.00</valueNumeric>\n"
			+ "        <valueString></valueString>\n" + "        <dataType>NUMERIC_BIGDECIMAL</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </value>\n" + "\n" + "    </list>\n" + "\n" + "\n"
			+ "    <list>\n" + "\n" + "      <value>\n" + "        <valueNumeric class=\"int\">4</valueNumeric>\n"
			+ "        <valueString></valueString>\n" + "        <dataType>NUMERIC_INTEGER</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </value>\n" + "\n" + "      <value>\n"
			+ "        <valueString>TMC-GDS</valueString>\n" + "        <dataType>STRING</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </value>\n" + "\n" + "      <value>\n"
			+ "        <valueString>Fee</valueString>\n" + "        <dataType>STRING</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </value>\n" + "\n" + "      <value>\n"
			+ "        <valueNumeric class=\"int\">200</valueNumeric>\n" + "        <valueString></valueString>\n"
			+ "        <dataType>NUMERIC_INTEGER</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "\n" + "      <value>\n" + "        <valueBoolean>true</valueBoolean>\n"
			+ "        <valueString></valueString>\n" + "        <dataType>BOOLEAN</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </value>\n" + "\n" + "      <value>\n"
			+ "        <valueBoolean>true</valueBoolean>\n" + "        <valueString></valueString>\n"
			+ "        <dataType>BOOLEAN</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "\n" + "      <value>\n" + "        <valueString></valueString>\n"
			+ "        <dataType>STRING</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "\n" + "      <value>\n" + "        <valueString></valueString>\n"
			+ "        <dataType>STRING</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "\n" + "      <value>\n" + "        <valueString></valueString>\n"
			+ "        <dataType>STRING</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "\n" + "      <value>\n" + "        <valueString></valueString>\n"
			+ "        <dataType>STRING</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "\n" + "      <value>\n" + "        <valueString>HRSDT</valueString>\n"
			+ "        <dataType>STRING</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "\n" + "      <value>\n" + "        <valueString></valueString>\n"
			+ "        <dataType>STRING</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "\n" + "      <value>\n" + "        <valueString></valueString>\n"
			+ "        <dataType>STRING</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "\n" + "      <value>\n" + "        <valueNumeric>5.00</valueNumeric>\n"
			+ "        <valueString></valueString>\n" + "        <dataType>NUMERIC_BIGDECIMAL</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </value>\n" + "\n" + "      <value>\n"
			+ "        <valueNumeric>0</valueNumeric>\n" + "        <valueString></valueString>\n"
			+ "        <dataType>NUMERIC_BIGDECIMAL</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "\n" + "      <value>\n" + "        <valueNumeric>0</valueNumeric>\n"
			+ "        <valueString></valueString>\n" + "        <dataType>NUMERIC_BIGDECIMAL</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </value>\n" + "\n" + "    </list>\n" + "\n"
			+ "    <list>\n" + "\n" + "      <value>\n" + "        <valueNumeric class=\"int\">5</valueNumeric>\n"
			+ "        <valueString></valueString>\n" + "        <dataType>NUMERIC_INTEGER</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </value>\n" + "\n" + "      <value>\n"
			+ "        <valueString>TMC-XML</valueString>\n" + "        <dataType>STRING</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </value>\n" + "\n" + "      <value>\n"
			+ "        <valueString>Fee</valueString>\n" + "        <dataType>STRING</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </value>\n" + "\n" + "      <value>\n"
			+ "        <valueNumeric class=\"int\">190</valueNumeric>\n" + "        <valueString></valueString>\n"
			+ "        <dataType>NUMERIC_INTEGER</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "\n" + "      <value>\n" + "        <valueBoolean>true</valueBoolean>\n"
			+ "        <valueString></valueString>\n" + "        <dataType>BOOLEAN</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </value>\n" + "      \n" + "      <value>\n"
			+ "        <valueBoolean>true</valueBoolean>\n" + "        <valueString></valueString>\n"
			+ "        <dataType>BOOLEAN</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "\n" + "      <value>\n" + "        <valueString></valueString>\n"
			+ "        <dataType>STRING</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "\n" + "      <value>\n" + "        <valueString></valueString>\n"
			+ "        <dataType>STRING</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "\n" + "      <value>\n" + "        <valueString></valueString>\n"
			+ "        <dataType>STRING</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "\n" + "      <value>\n" + "        <valueString></valueString>\n"
			+ "        <dataType>STRING</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "\n" + "      <value>\n" + "        <valueString>HRSDT</valueString>\n"
			+ "        <dataType>STRING</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "\n" + "      <value>\n" + "        <valueString></valueString>\n"
			+ "        <dataType>STRING</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "\n" + "      <value>\n" + "        <valueString>IKB0G,IDL0G,IDC0G</valueString>\n"
			+ "        <dataType>STRING</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "\n" + "      <value>\n" + "        <valueNumeric>0</valueNumeric>\n"
			+ "        <valueString></valueString>\n" + "        <dataType>NUMERIC_BIGDECIMAL</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </value>\n" + "\n" + "      <value>\n"
			+ "        <valueNumeric>1.75</valueNumeric>\n" + "        <valueString></valueString>\n"
			+ "        <dataType>NUMERIC_BIGDECIMAL</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "\n" + "      <value>\n" + "        <valueNumeric>0</valueNumeric>\n"
			+ "        <valueString></valueString>\n" + "        <dataType>NUMERIC_BIGDECIMAL</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </value>\n" + "\n" + "    </list>\n" + "\n"
			+ "  </data>\n" + "\n" + "</decision-table52>";
	private static String gdst2 = "<decision-table52>\n" + "  <tableName>Commission_List</tableName>\n"
			+ "  <rowNumberCol>\n" + "    <hideColumn>false</hideColumn>\n" + "    <width>50</width>\n"
			+ "  </rowNumberCol>\n" + "  <descriptionCol>\n" + "    <hideColumn>false</hideColumn>\n"
			+ "    <width>176</width>\n" + "  </descriptionCol>\n" + "  <metadataCols/>\n" + "  <attributeCols>\n"
			+ "    <attribute-column52>\n" + "      <typedDefaultValue>\n" + "        <valueString></valueString>\n"
			+ "        <dataType>STRING</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </typedDefaultValue>\n" + "      <hideColumn>false</hideColumn>\n" + "      <width>100</width>\n"
			+ "      <attribute>ruleflow-group</attribute>\n" + "      <reverseOrder>false</reverseOrder>\n"
			+ "      <useRowNumber>false</useRowNumber>\n" + "    </attribute-column52>\n"
			+ "    <attribute-column52>\n" + "      <typedDefaultValue>\n"
			+ "        <valueNumeric class=\"int\">0</valueNumeric>\n" + "        <valueString></valueString>\n"
			+ "        <dataType>NUMERIC_INTEGER</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </typedDefaultValue>\n" + "      <hideColumn>false</hideColumn>\n" + "      <width>130</width>\n"
			+ "      <attribute>salience</attribute>\n" + "      <reverseOrder>false</reverseOrder>\n"
			+ "      <useRowNumber>false</useRowNumber>\n" + "    </attribute-column52>\n"
			+ "    <attribute-column52>\n" + "      <typedDefaultValue>\n"
			+ "        <valueBoolean>false</valueBoolean>\n" + "        <valueString></valueString>\n"
			+ "        <dataType>BOOLEAN</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </typedDefaultValue>\n" + "      <hideColumn>true</hideColumn>\n" + "      <width>100</width>\n"
			+ "      <attribute>enabled</attribute>\n" + "      <reverseOrder>false</reverseOrder>\n"
			+ "      <useRowNumber>false</useRowNumber>\n" + "    </attribute-column52>\n" + "  </attributeCols>\n"
			+ "  <conditionPatterns>\n" + "    <Pattern52>\n" + "      <factType>Reservation</factType>\n"
			+ "      <boundName>R1</boundName>\n" + "      <isNegated>false</isNegated>\n" + "      <conditions>\n"
			+ "        <condition-column52>\n" + "          <typedDefaultValue>\n"
			+ "            <valueBoolean>true</valueBoolean>\n" + "            <valueString></valueString>\n"
			+ "            <dataType>BOOLEAN</dataType>\n" + "            <isOtherwise>false</isOtherwise>\n"
			+ "          </typedDefaultValue>\n" + "          <hideColumn>true</hideColumn>\n"
			+ "          <width>100</width>\n" + "          <header>Eligible</header>\n"
			+ "          <constraintValueType>1</constraintValueType>\n"
			+ "          <factField>commissionEligibility</factField>\n" + "          <fieldType>Boolean</fieldType>\n"
			+ "          <operator>==</operator>\n" + "          <parameters/>\n" + "          <binding></binding>\n"
			+ "        </condition-column52>\n" + "        <condition-column52>\n" + "          <typedDefaultValue>\n"
			+ "            <valueString>Y</valueString>\n" + "            <dataType>STRING</dataType>\n"
			+ "            <isOtherwise>false</isOtherwise>\n" + "          </typedDefaultValue>\n"
			+ "          <hideColumn>false</hideColumn>\n" + "          <width>100</width>\n"
			+ "          <header>Comm Flag</header>\n" + "          <constraintValueType>1</constraintValueType>\n"
			+ "          <factField>commissionFlag</factField>\n" + "          <fieldType>String</fieldType>\n"
			+ "          <operator>==</operator>\n" + "          <valueList>Y,N</valueList>\n"
			+ "          <parameters/>\n" + "          <binding></binding>\n" + "        </condition-column52>\n"
			+ "        <condition-column52>\n" + "          <typedDefaultValue>\n"
			+ "            <valueString></valueString>\n" + "            <dataType>STRING</dataType>\n"
			+ "            <isOtherwise>false</isOtherwise>\n" + "          </typedDefaultValue>\n"
			+ "          <hideColumn>false</hideColumn>\n" + "          <width>100</width>\n"
			+ "          <header>TCID</header>\n" + "          <constraintValueType>1</constraintValueType>\n"
			+ "          <factField>travelConsultId</factField>\n" + "          <fieldType>String</fieldType>\n"
			+ "          <operator>in</operator>\n" + "          <parameters/>\n" + "          <binding></binding>\n"
			+ "        </condition-column52>\n" + "        <condition-column52>\n" + "          <typedDefaultValue>\n"
			+ "            <valueString></valueString>\n" + "            <dataType>STRING</dataType>\n"
			+ "            <isOtherwise>false</isOtherwise>\n" + "          </typedDefaultValue>\n"
			+ "          <hideColumn>false</hideColumn>\n" + "          <width>100</width>\n"
			+ "          <header>Hotel</header>\n" + "          <constraintValueType>1</constraintValueType>\n"
			+ "          <factField>hotelCode</factField>\n" + "          <fieldType>String</fieldType>\n"
			+ "          <operator>in</operator>\n" + "          <parameters/>\n" + "          <binding></binding>\n"
			+ "        </condition-column52>\n" + "        <condition-column52>\n" + "          <typedDefaultValue>\n"
			+ "            <valueString></valueString>\n" + "            <dataType>STRING</dataType>\n"
			+ "            <isOtherwise>false</isOtherwise>\n" + "          </typedDefaultValue>\n"
			+ "          <hideColumn>false</hideColumn>\n" + "          <width>100</width>\n"
			+ "          <header>Hotel Country</header>\n" + "          <constraintValueType>1</constraintValueType>\n"
			+ "          <factField>hotelCountryCode</factField>\n" + "          <fieldType>String</fieldType>\n"
			+ "          <operator>in</operator>\n" + "          <parameters/>\n" + "          <binding></binding>\n"
			+ "        </condition-column52>\n" + "        <condition-column52>\n" + "          <typedDefaultValue>\n"
			+ "            <valueString></valueString>\n" + "            <dataType>STRING</dataType>\n"
			+ "            <isOtherwise>false</isOtherwise>\n" + "          </typedDefaultValue>\n"
			+ "          <hideColumn>false</hideColumn>\n" + "          <width>100</width>\n"
			+ "          <header>Rate Category</header>\n" + "          <constraintValueType>1</constraintValueType>\n"
			+ "          <factField>rateCategory</factField>\n" + "          <fieldType>String</fieldType>\n"
			+ "          <operator>in</operator>\n" + "          <parameters/>\n" + "          <binding></binding>\n"
			+ "        </condition-column52>\n" + "        <condition-column52>\n"
			+ "          <hideColumn>false</hideColumn>\n" + "          <width>138</width>\n"
			+ "          <header>Grp Cd exists</header>\n" + "          <constraintValueType>1</constraintValueType>\n"
			+ "          <factField>groupCode</factField>\n" + "          <fieldType>String</fieldType>\n"
			+ "          <operator>!= null</operator>\n" + "          <parameters/>\n"
			+ "          <binding></binding>\n" + "        </condition-column52>\n" + "      </conditions>\n"
			+ "      <window>\n" + "        <parameters/>\n" + "      </window>\n"
			+ "      <entryPointName></entryPointName>\n" + "    </Pattern52>\n" + "  </conditionPatterns>\n"
			+ "  <actionCols>\n" + "    <set-field-col52>\n" + "      <typedDefaultValue>\n"
			+ "        <valueString></valueString>\n" + "        <dataType>NUMERIC_DOUBLE</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </typedDefaultValue>\n"
			+ "      <hideColumn>false</hideColumn>\n" + "      <width>100</width>\n"
			+ "      <header>Sun Pct</header>\n" + "      <boundName>R1</boundName>\n"
			+ "      <factField>percentSunday</factField>\n" + "      <type>Double</type>\n"
			+ "      <update>false</update>\n" + "    </set-field-col52>\n" + "    <set-field-col52>\n"
			+ "      <typedDefaultValue>\n" + "        <valueString></valueString>\n"
			+ "        <dataType>NUMERIC_DOUBLE</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </typedDefaultValue>\n" + "      <hideColumn>false</hideColumn>\n" + "      <width>100</width>\n"
			+ "      <header>Mon Pct</header>\n" + "      <boundName>R1</boundName>\n"
			+ "      <factField>percentMonday</factField>\n" + "      <type>Double</type>\n"
			+ "      <valueList></valueList>\n" + "      <update>false</update>\n" + "    </set-field-col52>\n"
			+ "    <set-field-col52>\n" + "      <typedDefaultValue>\n" + "        <valueString></valueString>\n"
			+ "        <dataType>NUMERIC_DOUBLE</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </typedDefaultValue>\n" + "      <hideColumn>false</hideColumn>\n" + "      <width>100</width>\n"
			+ "      <header>Tue Pct</header>\n" + "      <boundName>R1</boundName>\n"
			+ "      <factField>percentTuesday</factField>\n" + "      <type>Double</type>\n"
			+ "      <update>false</update>\n" + "    </set-field-col52>\n" + "    <set-field-col52>\n"
			+ "      <typedDefaultValue>\n" + "        <valueString></valueString>\n"
			+ "        <dataType>NUMERIC_DOUBLE</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </typedDefaultValue>\n" + "      <hideColumn>false</hideColumn>\n" + "      <width>100</width>\n"
			+ "      <header>Wed Pct</header>\n" + "      <boundName>R1</boundName>\n"
			+ "      <factField>percentWednesday</factField>\n" + "      <type>Double</type>\n"
			+ "      <update>false</update>\n" + "    </set-field-col52>\n" + "    <set-field-col52>\n"
			+ "      <typedDefaultValue>\n" + "        <valueString></valueString>\n"
			+ "        <dataType>NUMERIC_DOUBLE</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </typedDefaultValue>\n" + "      <hideColumn>false</hideColumn>\n" + "      <width>100</width>\n"
			+ "      <header>Thu Pct</header>\n" + "      <boundName>R1</boundName>\n"
			+ "      <factField>percentThursday</factField>\n" + "      <type>Double</type>\n"
			+ "      <update>false</update>\n" + "    </set-field-col52>\n" + "    <set-field-col52>\n"
			+ "      <typedDefaultValue>\n" + "        <valueString></valueString>\n"
			+ "        <dataType>NUMERIC_DOUBLE</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </typedDefaultValue>\n" + "      <hideColumn>false</hideColumn>\n" + "      <width>100</width>\n"
			+ "      <header>Fri Pct</header>\n" + "      <boundName>R1</boundName>\n"
			+ "      <factField>percentFriday</factField>\n" + "      <type>Double</type>\n"
			+ "      <update>false</update>\n" + "    </set-field-col52>\n" + "    <set-field-col52>\n"
			+ "      <typedDefaultValue>\n" + "        <valueString></valueString>\n"
			+ "        <dataType>NUMERIC_DOUBLE</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </typedDefaultValue>\n" + "      <hideColumn>false</hideColumn>\n" + "      <width>100</width>\n"
			+ "      <header>Sat Pct</header>\n" + "      <boundName>R1</boundName>\n"
			+ "      <factField>percentSaturday</factField>\n" + "      <type>Double</type>\n"
			+ "      <update>false</update>\n" + "    </set-field-col52>\n" + "  </actionCols>\n" + "  <auditLog>\n"
			+ "    <filter class=\"org.drools.guvnor.client.modeldriven.dt52.auditlog.DecisionTableAuditLogFilter\">\n"
			+ "      <acceptedTypes>\n" + "        <entry>\n" + "          <string>INSERT_ROW</string>\n"
			+ "          <boolean>false</boolean>\n" + "        </entry>\n" + "        <entry>\n"
			+ "          <string>INSERT_COLUMN</string>\n" + "          <boolean>false</boolean>\n"
			+ "        </entry>\n" + "        <entry>\n" + "          <string>DELETE_ROW</string>\n"
			+ "          <boolean>false</boolean>\n" + "        </entry>\n" + "        <entry>\n"
			+ "          <string>DELETE_COLUMN</string>\n" + "          <boolean>false</boolean>\n"
			+ "        </entry>\n" + "        <entry>\n" + "          <string>UPDATE_COLUMN</string>\n"
			+ "          <boolean>false</boolean>\n" + "        </entry>\n" + "      </acceptedTypes>\n"
			+ "    </filter>\n" + "    <entries/>\n" + "  </auditLog>\n" + "  <imports>\n" + "    <imports>\n"
			+ "      <org.kie.soup.project.datamodel.imports.Import>\n"
			+ "        <type>com.ihg.ics.rules.model.Reservation</type>\n"
			+ "      </org.kie.soup.project.datamodel.imports.Import>\n" + "    </imports>\n" + "  </imports>\n"
			+ "  <packageName>com.ihg.bitbucket</packageName>\n" + "  <tableFormat>EXTENDED_ENTRY</tableFormat>\n"
			+ "  <hitPolicy>NONE</hitPolicy>\n" + "  <data>\n" + "    <list>\n" + "      <value>\n"
			+ "        <valueNumeric class=\"int\">1</valueNumeric>\n" + "        <valueString></valueString>\n"
			+ "        <dataType>NUMERIC_INTEGER</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "      <value>\n" + "        <valueString>Default</valueString>\n"
			+ "        <dataType>STRING</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "      <value>\n" + "        <valueString>G2</valueString>\n"
			+ "        <dataType>STRING</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "      <value>\n" + "        <valueNumeric class=\"int\">9999</valueNumeric>\n"
			+ "        <valueString></valueString>\n" + "        <dataType>NUMERIC_INTEGER</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </value>\n" + "      <value>\n"
			+ "        <valueBoolean>true</valueBoolean>\n" + "        <valueString></valueString>\n"
			+ "        <dataType>BOOLEAN</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "      <value>\n" + "        <valueBoolean>true</valueBoolean>\n"
			+ "        <valueString></valueString>\n" + "        <dataType>BOOLEAN</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </value>\n" + "      <value>\n"
			+ "        <valueString>Y</valueString>\n" + "        <dataType>STRING</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </value>\n" + "      <value>\n"
			+ "        <valueString></valueString>\n" + "        <dataType>STRING</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </value>\n" + "      <value>\n"
			+ "        <valueString></valueString>\n" + "        <dataType>STRING</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </value>\n" + "      <value>\n"
			+ "        <valueString></valueString>\n" + "        <dataType>STRING</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </value>\n" + "      <value>\n"
			+ "        <valueString></valueString>\n" + "        <dataType>STRING</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </value>\n" + "      <value>\n"
			+ "        <valueBoolean>false</valueBoolean>\n" + "        <valueString></valueString>\n"
			+ "        <dataType>BOOLEAN</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "      <value>\n" + "        <valueNumeric class=\"double\">0.1</valueNumeric>\n"
			+ "        <valueString></valueString>\n" + "        <dataType>NUMERIC_DOUBLE</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </value>\n" + "      <value>\n"
			+ "        <valueNumeric class=\"double\">0.1</valueNumeric>\n" + "        <valueString></valueString>\n"
			+ "        <dataType>NUMERIC_DOUBLE</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "      <value>\n" + "        <valueNumeric class=\"double\">0.1</valueNumeric>\n"
			+ "        <valueString></valueString>\n" + "        <dataType>NUMERIC_DOUBLE</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </value>\n" + "      <value>\n"
			+ "        <valueNumeric class=\"double\">0.1</valueNumeric>\n" + "        <valueString></valueString>\n"
			+ "        <dataType>NUMERIC_DOUBLE</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "      <value>\n" + "        <valueNumeric class=\"double\">0.1</valueNumeric>\n"
			+ "        <valueString></valueString>\n" + "        <dataType>NUMERIC_DOUBLE</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </value>\n" + "      <value>\n"
			+ "        <valueNumeric class=\"double\">0.1</valueNumeric>\n" + "        <valueString></valueString>\n"
			+ "        <dataType>NUMERIC_DOUBLE</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "      <value>\n" + "        <valueNumeric class=\"double\">0.1</valueNumeric>\n"
			+ "        <valueString></valueString>\n" + "        <dataType>NUMERIC_DOUBLE</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </value>\n" + "    </list>\n" + "    <list>\n"
			+ "      <value>\n" + "        <valueNumeric class=\"int\">2</valueNumeric>\n"
			+ "        <valueString></valueString>\n" + "        <dataType>NUMERIC_INTEGER</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </value>\n" + "      <value>\n"
			+ "        <valueString>Country Default - GBR , NLD</valueString>\n"
			+ "        <dataType>STRING</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "      <value>\n" + "        <valueString>G2</valueString>\n"
			+ "        <dataType>STRING</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "      <value>\n" + "        <valueNumeric class=\"int\">9960</valueNumeric>\n"
			+ "        <valueString></valueString>\n" + "        <dataType>NUMERIC_INTEGER</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </value>\n" + "      <value>\n"
			+ "        <valueBoolean>true</valueBoolean>\n" + "        <valueString></valueString>\n"
			+ "        <dataType>BOOLEAN</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "      <value>\n" + "        <valueBoolean>true</valueBoolean>\n"
			+ "        <valueString></valueString>\n" + "        <dataType>BOOLEAN</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </value>\n" + "      <value>\n"
			+ "        <valueString>Y</valueString>\n" + "        <dataType>STRING</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </value>\n" + "      <value>\n"
			+ "        <valueString></valueString>\n" + "        <dataType>STRING</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </value>\n" + "      <value>\n"
			+ "        <valueString></valueString>\n" + "        <dataType>STRING</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </value>\n" + "      <value>\n"
			+ "        <valueString>GBR,NLD</valueString>\n" + "        <dataType>STRING</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </value>\n" + "      <value>\n"
			+ "        <valueString></valueString>\n" + "        <dataType>STRING</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </value>\n" + "      <value>\n"
			+ "        <valueBoolean>false</valueBoolean>\n" + "        <valueString></valueString>\n"
			+ "        <dataType>BOOLEAN</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "      <value>\n" + "        <valueNumeric class=\"double\">0.1122</valueNumeric>\n"
			+ "        <valueString></valueString>\n" + "        <dataType>NUMERIC_DOUBLE</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </value>\n" + "      <value>\n"
			+ "        <valueNumeric class=\"double\">0.1122</valueNumeric>\n" + "        <valueString></valueString>\n"
			+ "        <dataType>NUMERIC_DOUBLE</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "      <value>\n" + "        <valueNumeric class=\"double\">0.1122</valueNumeric>\n"
			+ "        <valueString></valueString>\n" + "        <dataType>NUMERIC_DOUBLE</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </value>\n" + "      <value>\n"
			+ "        <valueNumeric class=\"double\">0.1122</valueNumeric>\n" + "        <valueString></valueString>\n"
			+ "        <dataType>NUMERIC_DOUBLE</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "      <value>\n" + "        <valueNumeric class=\"double\">0.1122</valueNumeric>\n"
			+ "        <valueString></valueString>\n" + "        <dataType>NUMERIC_DOUBLE</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </value>\n" + "      <value>\n"
			+ "        <valueNumeric class=\"double\">0.1122</valueNumeric>\n" + "        <valueString></valueString>\n"
			+ "        <dataType>NUMERIC_DOUBLE</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "      <value>\n" + "        <valueNumeric class=\"double\">0.1122</valueNumeric>\n"
			+ "        <valueString></valueString>\n" + "        <dataType>NUMERIC_DOUBLE</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </value>\n" + "    </list>\n" + "    <list>\n"
			+ "      <value>\n" + "        <valueNumeric class=\"int\">3</valueNumeric>\n"
			+ "        <valueString></valueString>\n" + "        <dataType>NUMERIC_INTEGER</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </value>\n" + "      <value>\n"
			+ "        <valueString>Country Default - AUS</valueString>\n" + "        <dataType>STRING</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </value>\n" + "      <value>\n"
			+ "        <valueString>G2</valueString>\n" + "        <dataType>STRING</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </value>\n" + "      <value>\n"
			+ "        <valueNumeric class=\"int\">9960</valueNumeric>\n" + "        <valueString></valueString>\n"
			+ "        <dataType>NUMERIC_INTEGER</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "      <value>\n" + "        <valueBoolean>true</valueBoolean>\n"
			+ "        <valueString></valueString>\n" + "        <dataType>BOOLEAN</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </value>\n" + "      <value>\n"
			+ "        <valueBoolean>true</valueBoolean>\n" + "        <valueString></valueString>\n"
			+ "        <dataType>BOOLEAN</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "      <value>\n" + "        <valueString>Y</valueString>\n"
			+ "        <dataType>STRING</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "      <value>\n" + "        <valueString></valueString>\n"
			+ "        <dataType>STRING</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "      <value>\n" + "        <valueString></valueString>\n"
			+ "        <dataType>STRING</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "      <value>\n" + "        <valueString>AUS</valueString>\n"
			+ "        <dataType>STRING</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "      <value>\n" + "        <valueString></valueString>\n"
			+ "        <dataType>STRING</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "      <value>\n" + "        <valueBoolean>false</valueBoolean>\n"
			+ "        <valueString></valueString>\n" + "        <dataType>BOOLEAN</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </value>\n" + "      <value>\n"
			+ "        <valueNumeric class=\"double\">0.1133</valueNumeric>\n" + "        <valueString></valueString>\n"
			+ "        <dataType>NUMERIC_DOUBLE</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "      <value>\n" + "        <valueNumeric class=\"double\">0.1133</valueNumeric>\n"
			+ "        <valueString></valueString>\n" + "        <dataType>NUMERIC_DOUBLE</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </value>\n" + "      <value>\n"
			+ "        <valueNumeric class=\"double\">0.1133</valueNumeric>\n" + "        <valueString></valueString>\n"
			+ "        <dataType>NUMERIC_DOUBLE</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "      <value>\n" + "        <valueNumeric class=\"double\">0.1133</valueNumeric>\n"
			+ "        <valueString></valueString>\n" + "        <dataType>NUMERIC_DOUBLE</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </value>\n" + "      <value>\n"
			+ "        <valueNumeric class=\"double\">0.1133</valueNumeric>\n" + "        <valueString></valueString>\n"
			+ "        <dataType>NUMERIC_DOUBLE</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "      <value>\n" + "        <valueNumeric class=\"double\">0.1133</valueNumeric>\n"
			+ "        <valueString></valueString>\n" + "        <dataType>NUMERIC_DOUBLE</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </value>\n" + "      <value>\n"
			+ "        <valueNumeric class=\"double\">0.1133</valueNumeric>\n" + "        <valueString></valueString>\n"
			+ "        <dataType>NUMERIC_DOUBLE</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "    </list>\n" + "    <list>\n" + "      <value>\n"
			+ "        <valueNumeric class=\"int\">4</valueNumeric>\n" + "        <valueString></valueString>\n"
			+ "        <dataType>NUMERIC_INTEGER</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "      <value>\n" + "        <valueString>Hotel Default</valueString>\n"
			+ "        <dataType>STRING</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "      <value>\n" + "        <valueString>G2</valueString>\n"
			+ "        <dataType>STRING</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "      <value>\n" + "        <valueNumeric class=\"int\">9950</valueNumeric>\n"
			+ "        <valueString></valueString>\n" + "        <dataType>NUMERIC_INTEGER</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </value>\n" + "      <value>\n"
			+ "        <valueBoolean>true</valueBoolean>\n" + "        <valueString></valueString>\n"
			+ "        <dataType>BOOLEAN</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "      <value>\n" + "        <valueBoolean>true</valueBoolean>\n"
			+ "        <valueString></valueString>\n" + "        <dataType>BOOLEAN</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </value>\n" + "      <value>\n"
			+ "        <valueString>Y</valueString>\n" + "        <dataType>STRING</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </value>\n" + "      <value>\n"
			+ "        <valueString></valueString>\n" + "        <dataType>STRING</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </value>\n" + "      <value>\n"
			+ "        <valueString>MIAHB,LONHB,MANOS</valueString>\n" + "        <dataType>STRING</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </value>\n" + "      <value>\n"
			+ "        <valueString></valueString>\n" + "        <dataType>STRING</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </value>\n" + "      <value>\n"
			+ "        <valueString></valueString>\n" + "        <dataType>STRING</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </value>\n" + "      <value>\n"
			+ "        <valueBoolean>false</valueBoolean>\n" + "        <valueString></valueString>\n"
			+ "        <dataType>BOOLEAN</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "      <value>\n" + "        <valueNumeric class=\"double\">0.1111</valueNumeric>\n"
			+ "        <valueString></valueString>\n" + "        <dataType>NUMERIC_DOUBLE</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </value>\n" + "      <value>\n"
			+ "        <valueNumeric class=\"double\">0.1111</valueNumeric>\n" + "        <valueString></valueString>\n"
			+ "        <dataType>NUMERIC_DOUBLE</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "      <value>\n" + "        <valueNumeric class=\"double\">0.1111</valueNumeric>\n"
			+ "        <valueString></valueString>\n" + "        <dataType>NUMERIC_DOUBLE</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </value>\n" + "      <value>\n"
			+ "        <valueNumeric class=\"double\">0.1111</valueNumeric>\n" + "        <valueString></valueString>\n"
			+ "        <dataType>NUMERIC_DOUBLE</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "      <value>\n" + "        <valueNumeric class=\"double\">0.1111</valueNumeric>\n"
			+ "        <valueString></valueString>\n" + "        <dataType>NUMERIC_DOUBLE</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </value>\n" + "      <value>\n"
			+ "        <valueNumeric class=\"double\">0.1111</valueNumeric>\n" + "        <valueString></valueString>\n"
			+ "        <dataType>NUMERIC_DOUBLE</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "      <value>\n" + "        <valueNumeric class=\"double\">0.1111</valueNumeric>\n"
			+ "        <valueString></valueString>\n" + "        <dataType>NUMERIC_DOUBLE</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </value>\n" + "    </list>\n" + "    <list>\n"
			+ "      <value>\n" + "        <valueNumeric class=\"int\">5</valueNumeric>\n"
			+ "        <valueString></valueString>\n" + "        <dataType>NUMERIC_INTEGER</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </value>\n" + "      <value>\n"
			+ "        <valueString>Hotel Override</valueString>\n" + "        <dataType>STRING</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </value>\n" + "      <value>\n"
			+ "        <valueString>G2</valueString>\n" + "        <dataType>STRING</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </value>\n" + "      <value>\n"
			+ "        <valueNumeric class=\"int\">800</valueNumeric>\n" + "        <valueString></valueString>\n"
			+ "        <dataType>NUMERIC_INTEGER</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "      <value>\n" + "        <valueBoolean>true</valueBoolean>\n"
			+ "        <valueString></valueString>\n" + "        <dataType>BOOLEAN</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </value>\n" + "      <value>\n"
			+ "        <valueBoolean>true</valueBoolean>\n" + "        <valueString></valueString>\n"
			+ "        <dataType>BOOLEAN</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "      <value>\n" + "        <valueString>Y</valueString>\n"
			+ "        <dataType>STRING</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "      <value>\n" + "        <valueString>12345678</valueString>\n"
			+ "        <dataType>STRING</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "      <value>\n" + "        <valueString>NYCHC</valueString>\n"
			+ "        <dataType>STRING</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "      <value>\n" + "        <valueString></valueString>\n"
			+ "        <dataType>STRING</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "      <value>\n" + "        <valueString></valueString>\n"
			+ "        <dataType>STRING</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "      <value>\n" + "        <valueBoolean>false</valueBoolean>\n"
			+ "        <valueString></valueString>\n" + "        <dataType>BOOLEAN</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </value>\n" + "      <value>\n"
			+ "        <valueNumeric class=\"double\">0.1444</valueNumeric>\n" + "        <valueString></valueString>\n"
			+ "        <dataType>NUMERIC_DOUBLE</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "      <value>\n" + "        <valueNumeric class=\"double\">0.1444</valueNumeric>\n"
			+ "        <valueString></valueString>\n" + "        <dataType>NUMERIC_DOUBLE</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </value>\n" + "      <value>\n"
			+ "        <valueNumeric class=\"double\">0.1444</valueNumeric>\n" + "        <valueString></valueString>\n"
			+ "        <dataType>NUMERIC_DOUBLE</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "      <value>\n" + "        <valueNumeric class=\"double\">0.1444</valueNumeric>\n"
			+ "        <valueString></valueString>\n" + "        <dataType>NUMERIC_DOUBLE</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </value>\n" + "      <value>\n"
			+ "        <valueNumeric class=\"double\">0.1444</valueNumeric>\n" + "        <valueString></valueString>\n"
			+ "        <dataType>NUMERIC_DOUBLE</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "      <value>\n" + "        <valueNumeric class=\"double\">0.1444</valueNumeric>\n"
			+ "        <valueString></valueString>\n" + "        <dataType>NUMERIC_DOUBLE</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </value>\n" + "      <value>\n"
			+ "        <valueNumeric class=\"double\">0.1444</valueNumeric>\n" + "        <valueString></valueString>\n"
			+ "        <dataType>NUMERIC_DOUBLE</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "    </list>\n" + "    <list>\n" + "      <value>\n"
			+ "        <valueNumeric class=\"int\">6</valueNumeric>\n" + "        <valueString></valueString>\n"
			+ "        <dataType>NUMERIC_INTEGER</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "      <value>\n" + "        <valueString>Groups</valueString>\n"
			+ "        <dataType>STRING</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "      <value>\n" + "        <valueString>G2</valueString>\n"
			+ "        <dataType>STRING</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "      <value>\n" + "        <valueNumeric class=\"int\">700</valueNumeric>\n"
			+ "        <valueString></valueString>\n" + "        <dataType>NUMERIC_INTEGER</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </value>\n" + "      <value>\n"
			+ "        <valueBoolean>true</valueBoolean>\n" + "        <valueString></valueString>\n"
			+ "        <dataType>BOOLEAN</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "      <value>\n" + "        <valueBoolean>true</valueBoolean>\n"
			+ "        <valueString></valueString>\n" + "        <dataType>BOOLEAN</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </value>\n" + "      <value>\n"
			+ "        <valueString>Y</valueString>\n" + "        <dataType>STRING</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </value>\n" + "      <value>\n"
			+ "        <valueString></valueString>\n" + "        <dataType>STRING</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </value>\n" + "      <value>\n"
			+ "        <valueString></valueString>\n" + "        <dataType>STRING</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </value>\n" + "      <value>\n"
			+ "        <valueString>USA,CAN</valueString>\n" + "        <dataType>STRING</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </value>\n" + "      <value>\n"
			+ "        <valueString>IGCOR</valueString>\n" + "        <dataType>STRING</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </value>\n" + "      <value>\n"
			+ "        <valueBoolean>true</valueBoolean>\n" + "        <valueString></valueString>\n"
			+ "        <dataType>BOOLEAN</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "      <value>\n" + "        <valueNumeric class=\"double\">0.07</valueNumeric>\n"
			+ "        <valueString></valueString>\n" + "        <dataType>NUMERIC_DOUBLE</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </value>\n" + "      <value>\n"
			+ "        <valueNumeric class=\"double\">0.07</valueNumeric>\n" + "        <valueString></valueString>\n"
			+ "        <dataType>NUMERIC_DOUBLE</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "      <value>\n" + "        <valueNumeric class=\"double\">0.07</valueNumeric>\n"
			+ "        <valueString></valueString>\n" + "        <dataType>NUMERIC_DOUBLE</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </value>\n" + "      <value>\n"
			+ "        <valueNumeric class=\"double\">0.07</valueNumeric>\n" + "        <valueString></valueString>\n"
			+ "        <dataType>NUMERIC_DOUBLE</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "      <value>\n" + "        <valueNumeric class=\"double\">0.07</valueNumeric>\n"
			+ "        <valueString></valueString>\n" + "        <dataType>NUMERIC_DOUBLE</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </value>\n" + "      <value>\n"
			+ "        <valueNumeric class=\"double\">0.07</valueNumeric>\n" + "        <valueString></valueString>\n"
			+ "        <dataType>NUMERIC_DOUBLE</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "      <value>\n" + "        <valueNumeric class=\"double\">0.07</valueNumeric>\n"
			+ "        <valueString></valueString>\n" + "        <dataType>NUMERIC_DOUBLE</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </value>\n" + "    </list>\n" + "    <list>\n"
			+ "      <value>\n" + "        <valueNumeric class=\"int\">7</valueNumeric>\n"
			+ "        <valueString></valueString>\n" + "        <dataType>NUMERIC_INTEGER</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </value>\n" + "      <value>\n"
			+ "        <valueString>GA Booking</valueString>\n" + "        <dataType>STRING</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </value>\n" + "      <value>\n"
			+ "        <valueString>G2</valueString>\n" + "        <dataType>STRING</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </value>\n" + "      <value>\n"
			+ "        <valueNumeric class=\"int\">500</valueNumeric>\n" + "        <valueString></valueString>\n"
			+ "        <dataType>NUMERIC_INTEGER</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "      <value>\n" + "        <valueBoolean>true</valueBoolean>\n"
			+ "        <valueString></valueString>\n" + "        <dataType>BOOLEAN</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </value>\n" + "      <value>\n"
			+ "        <valueBoolean>true</valueBoolean>\n" + "        <valueString></valueString>\n"
			+ "        <dataType>BOOLEAN</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "      <value>\n" + "        <valueString>Y</valueString>\n"
			+ "        <dataType>STRING</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "      <value>\n"
			+ "        <valueString>96029496,96029511,96029544,96060204</valueString>\n"
			+ "        <dataType>STRING</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "      <value>\n" + "        <valueString></valueString>\n"
			+ "        <dataType>STRING</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "      <value>\n" + "        <valueString></valueString>\n"
			+ "        <dataType>STRING</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "      <value>\n" + "        <valueString></valueString>\n"
			+ "        <dataType>STRING</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "      <value>\n" + "        <valueBoolean>false</valueBoolean>\n"
			+ "        <valueString></valueString>\n" + "        <dataType>BOOLEAN</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </value>\n" + "      <value>\n"
			+ "        <valueNumeric class=\"double\">0.135</valueNumeric>\n" + "        <valueString></valueString>\n"
			+ "        <dataType>NUMERIC_DOUBLE</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "      <value>\n" + "        <valueNumeric class=\"double\">0.135</valueNumeric>\n"
			+ "        <valueString></valueString>\n" + "        <dataType>NUMERIC_DOUBLE</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </value>\n" + "      <value>\n"
			+ "        <valueNumeric class=\"double\">0.135</valueNumeric>\n" + "        <valueString></valueString>\n"
			+ "        <dataType>NUMERIC_DOUBLE</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "      <value>\n" + "        <valueNumeric class=\"double\">0.135</valueNumeric>\n"
			+ "        <valueString></valueString>\n" + "        <dataType>NUMERIC_DOUBLE</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </value>\n" + "      <value>\n"
			+ "        <valueNumeric class=\"double\">0.135</valueNumeric>\n" + "        <valueString></valueString>\n"
			+ "        <dataType>NUMERIC_DOUBLE</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "      <value>\n" + "        <valueNumeric class=\"double\">0.135</valueNumeric>\n"
			+ "        <valueString></valueString>\n" + "        <dataType>NUMERIC_DOUBLE</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </value>\n" + "      <value>\n"
			+ "        <valueNumeric class=\"double\">0.135</valueNumeric>\n" + "        <valueString></valueString>\n"
			+ "        <dataType>NUMERIC_DOUBLE</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "    </list>\n" + "    <list>\n" + "      <value>\n"
			+ "        <valueNumeric class=\"int\">8</valueNumeric>\n" + "        <valueString></valueString>\n"
			+ "        <dataType>NUMERIC_INTEGER</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "      <value>\n" + "        <valueString>GA Expedia</valueString>\n"
			+ "        <dataType>STRING</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "      <value>\n" + "        <valueString>G2</valueString>\n"
			+ "        <dataType>STRING</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "      <value>\n" + "        <valueNumeric class=\"int\">500</valueNumeric>\n"
			+ "        <valueString></valueString>\n" + "        <dataType>NUMERIC_INTEGER</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </value>\n" + "      <value>\n"
			+ "        <valueBoolean>true</valueBoolean>\n" + "        <valueString></valueString>\n"
			+ "        <dataType>BOOLEAN</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "      <value>\n" + "        <valueBoolean>true</valueBoolean>\n"
			+ "        <valueString></valueString>\n" + "        <dataType>BOOLEAN</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </value>\n" + "      <value>\n"
			+ "        <valueString>Y</valueString>\n" + "        <dataType>STRING</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </value>\n" + "      <value>\n"
			+ "        <valueString>50545460,96076260,96076433</valueString>\n"
			+ "        <dataType>STRING</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "      <value>\n" + "        <valueString></valueString>\n"
			+ "        <dataType>STRING</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "      <value>\n" + "        <valueString></valueString>\n"
			+ "        <dataType>STRING</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "      <value>\n" + "        <valueString></valueString>\n"
			+ "        <dataType>STRING</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "      <value>\n" + "        <valueBoolean>false</valueBoolean>\n"
			+ "        <valueString></valueString>\n" + "        <dataType>BOOLEAN</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </value>\n" + "      <value>\n"
			+ "        <valueNumeric class=\"double\">0.18</valueNumeric>\n" + "        <valueString></valueString>\n"
			+ "        <dataType>NUMERIC_DOUBLE</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "      <value>\n" + "        <valueNumeric class=\"double\">0.14</valueNumeric>\n"
			+ "        <valueString></valueString>\n" + "        <dataType>NUMERIC_DOUBLE</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </value>\n" + "      <value>\n"
			+ "        <valueNumeric class=\"double\">0.125</valueNumeric>\n" + "        <valueString></valueString>\n"
			+ "        <dataType>NUMERIC_DOUBLE</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "      <value>\n" + "        <valueNumeric class=\"double\">0.125</valueNumeric>\n"
			+ "        <valueString></valueString>\n" + "        <dataType>NUMERIC_DOUBLE</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </value>\n" + "      <value>\n"
			+ "        <valueNumeric class=\"double\">0.14</valueNumeric>\n" + "        <valueString></valueString>\n"
			+ "        <dataType>NUMERIC_DOUBLE</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "      <value>\n" + "        <valueNumeric class=\"double\">0.18</valueNumeric>\n"
			+ "        <valueString></valueString>\n" + "        <dataType>NUMERIC_DOUBLE</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </value>\n" + "      <value>\n"
			+ "        <valueNumeric class=\"double\">0.18</valueNumeric>\n" + "        <valueString></valueString>\n"
			+ "        <dataType>NUMERIC_DOUBLE</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "    </list>\n" + "    <list>\n" + "      <value>\n"
			+ "        <valueNumeric class=\"int\">9</valueNumeric>\n" + "        <valueString></valueString>\n"
			+ "        <dataType>NUMERIC_INTEGER</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "      <value>\n" + "        <valueString>Booking 0%</valueString>\n"
			+ "        <dataType>STRING</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "      <value>\n" + "        <valueString>G2</valueString>\n"
			+ "        <dataType>STRING</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "      <value>\n" + "        <valueNumeric class=\"int\">100</valueNumeric>\n"
			+ "        <valueString></valueString>\n" + "        <dataType>NUMERIC_INTEGER</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </value>\n" + "      <value>\n"
			+ "        <valueBoolean>true</valueBoolean>\n" + "        <valueString></valueString>\n"
			+ "        <dataType>BOOLEAN</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "      <value>\n" + "        <valueBoolean>true</valueBoolean>\n"
			+ "        <valueString></valueString>\n" + "        <dataType>BOOLEAN</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </value>\n" + "      <value>\n"
			+ "        <valueString>Y</valueString>\n" + "        <dataType>STRING</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </value>\n" + "      <value>\n"
			+ "        <valueString>96029496,96029511,96029544,96060204</valueString>\n"
			+ "        <dataType>STRING</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "      <value>\n"
			+ "        <valueString>AGPAP,AMSNL,AUAAN,BAQEX,BCNBA</valueString>\n"
			+ "        <dataType>STRING</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "      <value>\n" + "        <valueString></valueString>\n"
			+ "        <dataType>STRING</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "      <value>\n" + "        <valueString></valueString>\n"
			+ "        <dataType>STRING</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "      <value>\n" + "        <valueBoolean>false</valueBoolean>\n"
			+ "        <valueString></valueString>\n" + "        <dataType>BOOLEAN</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </value>\n" + "      <value>\n"
			+ "        <valueNumeric class=\"double\">0.25</valueNumeric>\n" + "        <valueString></valueString>\n"
			+ "        <dataType>NUMERIC_DOUBLE</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "      <value>\n" + "        <valueNumeric class=\"double\">0.25</valueNumeric>\n"
			+ "        <valueString></valueString>\n" + "        <dataType>NUMERIC_DOUBLE</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </value>\n" + "      <value>\n"
			+ "        <valueNumeric class=\"double\">0.25</valueNumeric>\n" + "        <valueString></valueString>\n"
			+ "        <dataType>NUMERIC_DOUBLE</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "      <value>\n" + "        <valueNumeric class=\"double\">0.25</valueNumeric>\n"
			+ "        <valueString></valueString>\n" + "        <dataType>NUMERIC_DOUBLE</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </value>\n" + "      <value>\n"
			+ "        <valueNumeric class=\"double\">0.25</valueNumeric>\n" + "        <valueString></valueString>\n"
			+ "        <dataType>NUMERIC_DOUBLE</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "      <value>\n" + "        <valueNumeric class=\"double\">0.25</valueNumeric>\n"
			+ "        <valueString></valueString>\n" + "        <dataType>NUMERIC_DOUBLE</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </value>\n" + "      <value>\n"
			+ "        <valueNumeric class=\"double\">0.25</valueNumeric>\n" + "        <valueString></valueString>\n"
			+ "        <dataType>NUMERIC_DOUBLE</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "    </list>\n" + "    <list>\n" + "      <value>\n"
			+ "        <valueNumeric class=\"int\">10</valueNumeric>\n" + "        <valueString></valueString>\n"
			+ "        <dataType>NUMERIC_INTEGER</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "      <value>\n" + "        <valueString>Expedia UK</valueString>\n"
			+ "        <dataType>STRING</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "      <value>\n" + "        <valueString>G2</valueString>\n"
			+ "        <dataType>STRING</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "      <value>\n" + "        <valueNumeric class=\"int\">100</valueNumeric>\n"
			+ "        <valueString></valueString>\n" + "        <dataType>NUMERIC_INTEGER</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </value>\n" + "      <value>\n"
			+ "        <valueBoolean>true</valueBoolean>\n" + "        <valueString></valueString>\n"
			+ "        <dataType>BOOLEAN</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "      <value>\n" + "        <valueBoolean>true</valueBoolean>\n"
			+ "        <valueString></valueString>\n" + "        <dataType>BOOLEAN</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </value>\n" + "      <value>\n"
			+ "        <valueString>Y</valueString>\n" + "        <dataType>STRING</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </value>\n" + "      <value>\n"
			+ "        <valueString>50545460,96076260,96076433</valueString>\n"
			+ "        <dataType>STRING</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "      <value>\n" + "        <valueString></valueString>\n"
			+ "        <dataType>STRING</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "      <value>\n" + "        <valueString>GBR</valueString>\n"
			+ "        <dataType>STRING</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "      <value>\n" + "        <valueString></valueString>\n"
			+ "        <dataType>STRING</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "      <value>\n" + "        <valueBoolean>false</valueBoolean>\n"
			+ "        <valueString></valueString>\n" + "        <dataType>BOOLEAN</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </value>\n" + "      <value>\n"
			+ "        <valueNumeric class=\"double\">0.15</valueNumeric>\n" + "        <valueString></valueString>\n"
			+ "        <dataType>NUMERIC_DOUBLE</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "      <value>\n" + "        <valueNumeric class=\"double\">0.11667</valueNumeric>\n"
			+ "        <valueString></valueString>\n" + "        <dataType>NUMERIC_DOUBLE</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </value>\n" + "      <value>\n"
			+ "        <valueNumeric class=\"double\">0.10417</valueNumeric>\n"
			+ "        <valueString></valueString>\n" + "        <dataType>NUMERIC_DOUBLE</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </value>\n" + "      <value>\n"
			+ "        <valueNumeric class=\"double\">0.10417</valueNumeric>\n"
			+ "        <valueString></valueString>\n" + "        <dataType>NUMERIC_DOUBLE</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </value>\n" + "      <value>\n"
			+ "        <valueNumeric class=\"double\">0.11667</valueNumeric>\n"
			+ "        <valueString></valueString>\n" + "        <dataType>NUMERIC_DOUBLE</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </value>\n" + "      <value>\n"
			+ "        <valueNumeric class=\"double\">0.15</valueNumeric>\n" + "        <valueString></valueString>\n"
			+ "        <dataType>NUMERIC_DOUBLE</dataType>\n" + "        <isOtherwise>false</isOtherwise>\n"
			+ "      </value>\n" + "      <value>\n" + "        <valueNumeric class=\"double\">0.15</valueNumeric>\n"
			+ "        <valueString></valueString>\n" + "        <dataType>NUMERIC_DOUBLE</dataType>\n"
			+ "        <isOtherwise>false</isOtherwise>\n" + "      </value>\n" + "    </list>\n" + "  </data>\n"
			+ "</decision-table52>";

	private static ArrayList<String> gdstList = new ArrayList<String>();
	
	@Test
	public void search() {
		gdstList.add(gdst1);
		gdstList.add(gdst2);

		// Search a Guided Decision Table by Column Index and XML String Name
		// Returns Column Header and all data for that column
//		this.returnColumn(0, gdst1);

		this.searchTable("96029496");
	}

	public void searchTable(String search) {
		ArrayList<Integer> tableResults = new ArrayList<Integer>();
		ArrayList<Integer> rowResults = new ArrayList<Integer>();
		ArrayList<Integer> cellResults = new ArrayList<Integer>();

		ArrayList<ArrayList<String>> allData = new ArrayList<ArrayList<String>>();

		// Find table, row, and cell index of each search
		// For each table
		for (int i = 0; i < gdstList.size(); i++) {
			allData = this.buildData(gdstList.get(i));

			// For each row
			for (int j = 0; j < allData.size(); j++) {

				// for each cell
				for (int k = 0; k < allData.get(j).size(); k++) {

					// Look for a match and add index to arrays
					if (allData.get(j).get(k).contains(search)) {
						tableResults.add(i);
						rowResults.add(j);
						cellResults.add(k);
					}
				}
			}
		}

		for (int j = 0; j < tableResults.size(); j++) {

			System.out.println(
					"Results: " + (j + 1) + " of " + tableResults.size() + "____________________________________");

			// Get The column headers from the table
			System.out.println(buildColumnHeaders(gdstList.get(tableResults.get(j))));

			// Get the rows from the table
			ArrayList<ArrayList<String>> results = new ArrayList<ArrayList<String>>();
			results = buildData(gdstList.get(tableResults.get(j)));
			System.out.println(results.get(rowResults.get(j)));

		}
	}

	public void returnColumn(int columnNumber, String gdst) {
		System.out.println(this.buildColumnHeaders(gdst).get(columnNumber));

		for (int i = 0; i < this.buildData(gdst).size(); i++) {
			System.out.println("Row " + i + ": " + this.buildData(gdst).get(i).get(columnNumber));
		}
	}

	// Build Column Headers for each table including default table columns +
	// attribute columns + field columns
	public ArrayList<String> buildColumnHeaders(String gdst) {
		ArrayList<String> headers = new ArrayList<String>();
		ArrayList<String> attributes = new ArrayList<String>();
		ArrayList<String> conditions = new ArrayList<String>();
		ArrayList<String> actions = new ArrayList<String>();

		attributes = this.parseAttributeColumns(this.gatherAttributeColumns(gdst));
		conditions = this.parseConditionColumns(this.gatherConditionColumns(gdst));
		actions = this.parseActionColumns(this.gatherActionColumns(gdst));

		// Default Table Columns
		headers.add("rowNumberCol");
		headers.add("descriptionCol");

		// Attribute Columns
		for (String attribute : attributes) {
			headers.add(attribute);
		}

		// Condition Columns
		for (String condition : conditions) {
			headers.add(condition);
		}

		// Action Columns
		for (String action : actions) {
			headers.add(action);
		}

		return headers;
	}
	

	// Parse Data Section
	public ArrayList<ArrayList<String>> buildData(String gdst) {
		ArrayList<ArrayList<String>> allData = new ArrayList<ArrayList<String>>();

		ArrayList<String> gatheredDataColumns = this.gatherDataColumns(gdst);
		ArrayList<String> parsedDataColumns = this.parseDataRows(gatheredDataColumns);
		ArrayList<ArrayList<String>> parsedDataValues = this.parseDataValues(parsedDataColumns);

		for (ArrayList<String> row : parsedDataValues) {
			allData.add(this.parseIndividualValues(row));
		}

		return allData;
	}

	// Parse Attributes Section from XML
	
	public ArrayList<String> gatherAttributeColumns(String gdstString) {
		ArrayList<String> attributes = new ArrayList<String>();

		String attributeXML;
		String startCondition = "<attributeCols>";
		String endCondition = "</attributeCols>";
		attributeXML = gdstString.substring(gdstString.indexOf(startCondition),
				gdstString.indexOf(endCondition) + endCondition.length() - 1);
		attributes.add(attributeXML);

		return attributes;
	}

	// Parse Each Attribute from Attributes Section
	
	public ArrayList<String> parseAttributeColumns(ArrayList<String> singleGDSTAttributesList) {
		// String conditionXML;
		String startAllAttributes = "<attribute-column";
		String endAllAttributes = "</attribute-column";
		String startAttribute = "<attribute>";
		String endAttributeFact = "</attribute>";
		ArrayList<Integer> startIndex = new ArrayList<Integer>();
		ArrayList<Integer> endIndex = new ArrayList<Integer>();
		ArrayList<String> columnHeaders = new ArrayList<String>();

		int fromIndex = 0;
		int endAllAttributesLength = endAllAttributes.length();
		int startAttributeLength = startAttribute.length();

		// For each gdst table conditions
		for (String gdstAttribute : singleGDSTAttributesList) {
			List<String> attributes = new ArrayList<String>();

			// Find starting index of each attribute
			while ((fromIndex = gdstAttribute.indexOf(startAllAttributes, fromIndex)) != -1) {

				startIndex.add(fromIndex);
				fromIndex++;
			}

			// Find ending index of each attribute
			while ((fromIndex = gdstAttribute.indexOf(endAllAttributes, fromIndex)) != -1) {

				endIndex.add(fromIndex + endAllAttributesLength);
				fromIndex++;
			}

			// Parse each attribute
			for (int i = 0; i < startIndex.size(); i++) {

				String gdstSingleCondition = gdstAttribute.substring(startIndex.get(i), endIndex.get(i));
				attributes.add(gdstSingleCondition);
			}

			// Parse attribute name from attribute and store
			for (String attribute : attributes) {
				String fieldName = attribute.substring(attribute.indexOf(startAttribute) + startAttributeLength,
						attribute.indexOf(endAttributeFact));

				columnHeaders.add(fieldName);
			}
		}

		return columnHeaders;
	}

	// Parse Conditions Section from XML
	
	public ArrayList<String> gatherConditionColumns(String gdstString) {
		ArrayList<String> conditions = new ArrayList<String>();

		String conditionXML;
		String startCondition = "<conditionPatterns>";
		String endCondition = "</conditionPatterns>";
		conditionXML = gdstString.substring(gdstString.indexOf(startCondition),
				gdstString.indexOf(endCondition) + endCondition.length() - 1);
		conditions.add(conditionXML);

		return conditions;
	}

	// Parse Each Condition from Conditions Section
	
	public ArrayList<String> parseConditionColumns(ArrayList<String> singleGDSTConditionsList) {
		// Array Contains all conditions for each Single GDST as an index value

		String startAllConditions = "<condition-column";
		String endAllConditions = "</condition-column";
		String startConditionFact = "<factField>";
		String endConditionFact = "</factField>";
		ArrayList<Integer> startIndex = new ArrayList<Integer>();
		ArrayList<Integer> endIndex = new ArrayList<Integer>();
		ArrayList<String> columnHeaders = new ArrayList<String>();

		int fromIndex = 0;
		int endConditionLength = endAllConditions.length();
		int startConditionFactLength = startConditionFact.length();

		// For each gdst table conditions
		for (String gdstCondition : singleGDSTConditionsList) {
			List<String> conditions = new ArrayList<String>();

			// Find starting index of each condition
			while ((fromIndex = gdstCondition.indexOf(startAllConditions, fromIndex)) != -1) {
				startIndex.add(fromIndex);
				fromIndex++;
			}

			// Find ending index of each condition
			while ((fromIndex = gdstCondition.indexOf(endAllConditions, fromIndex)) != -1) {
				endIndex.add(fromIndex + endConditionLength);
				fromIndex++;
			}

			// Parse each condition
			for (int i = 0; i < startIndex.size(); i++) {

				String gdstSingleCondition = gdstCondition.substring(startIndex.get(i), endIndex.get(i));
				conditions.add(gdstSingleCondition);
			}

			// Parse field name from condition and store
			for (String condition : conditions) {
				String fieldName = condition.substring(condition.indexOf(startConditionFact) + startConditionFactLength,
						condition.indexOf(endConditionFact));
				columnHeaders.add(fieldName);
			}
		}

		return columnHeaders;
	}

	// Parse Each Condition from Conditions Section
	public ArrayList<String> parseConditionOperatorColumns(ArrayList<String> singleGDSTConditionsList) {
		// Array Contains all conditions for each Single GDST as an index value

		String startAllConditions = "<condition-column";
		String endAllConditions = "</condition-column";
		String startConditionFact = "<operator>";
		String endConditionFact = "</operator>";
		ArrayList<Integer> startIndex = new ArrayList<Integer>();
		ArrayList<Integer> endIndex = new ArrayList<Integer>();
		ArrayList<String> columnHeaders = new ArrayList<String>();

		int fromIndex = 0;
		int endConditionLength = endAllConditions.length();
		int startConditionFactLength = startConditionFact.length();

		// For each gdst table conditions
		for (String gdstCondition : singleGDSTConditionsList) {
			List<String> conditions = new ArrayList<String>();

			// Find starting index of each condition
			while ((fromIndex = gdstCondition.indexOf(startAllConditions, fromIndex)) != -1) {
				startIndex.add(fromIndex);
				fromIndex++;
			}

			// Find ending index of each condition
			while ((fromIndex = gdstCondition.indexOf(endAllConditions, fromIndex)) != -1) {
				endIndex.add(fromIndex + endConditionLength);
				fromIndex++;
			}

			// Parse each condition
			for (int i = 0; i < startIndex.size(); i++) {

				String gdstSingleCondition = gdstCondition.substring(startIndex.get(i), endIndex.get(i));
				conditions.add(gdstSingleCondition);
			}

			// Parse field name from condition and store
			for (String condition : conditions) {
				String fieldName = condition.substring(condition.indexOf(startConditionFact) + startConditionFactLength,
						condition.indexOf(endConditionFact));
				columnHeaders.add(fieldName);
			}
		}

		return columnHeaders;
	}
// Parse Actions Section from XML

	public ArrayList<String> gatherActionColumns(String gdstString) {
		ArrayList<String> actions = new ArrayList<String>();

		String actionXML;
		String startAction = "<actionCols>";
		String endAction = "</actionCols>";
		actionXML = gdstString.substring(gdstString.indexOf(startAction),
				gdstString.indexOf(endAction) + endAction.length() - 1);
		actions.add(actionXML);

		return actions;
	}

	// Parse Each Action from Actions Section
	public ArrayList<String> parseActionColumns(ArrayList<String> singleGDSTActionList) {
		// Array Contains all actions for each Single GDST as an index value

		String startAllActions = "<set-field-col";
		String endAllActions = "</set-field-col";
		String startActionFact = "<factField>";
		String endActionFact = "</factField>";
		ArrayList<Integer> startIndex = new ArrayList<Integer>();
		ArrayList<Integer> endIndex = new ArrayList<Integer>();
		ArrayList<String> columnHeaders = new ArrayList<String>();

		int fromIndex = 0;
		int endConditionLength = endAllActions.length();
		int startConditionFactLength = startActionFact.length();

		// For each gdst table actions
		for (String gdstCondition : singleGDSTActionList) {
			List<String> conditions = new ArrayList<String>();

			// Find starting index of each action
			while ((fromIndex = gdstCondition.indexOf(startAllActions, fromIndex)) != -1) {
				startIndex.add(fromIndex);
				fromIndex++;
			}

			// Find ending index of each action
			while ((fromIndex = gdstCondition.indexOf(endAllActions, fromIndex)) != -1) {
				endIndex.add(fromIndex + endConditionLength);
				fromIndex++;
			}

			// Parse each action
			for (int i = 0; i < startIndex.size(); i++) {

				String gdstSingleCondition = gdstCondition.substring(startIndex.get(i), endIndex.get(i));
				conditions.add(gdstSingleCondition);
			}

			// Parse field name from action and store
			for (String condition : conditions) {
				String fieldName = condition.substring(condition.indexOf(startActionFact) + startConditionFactLength,
						condition.indexOf(endActionFact));
				columnHeaders.add(fieldName);
			}
		}

		return columnHeaders;
	}
	

	// Parse Data Section
	public ArrayList<String> gatherDataColumns(String gdstString) {
		ArrayList<String> dataSet = new ArrayList<String>();

		String dataXML;
		String startData = "<data>";
		String endData = "</data>";
		dataXML = gdstString.substring(gdstString.indexOf(startData),
				gdstString.indexOf(endData) + endData.length() - 1);
		dataSet.add(dataXML);

		return dataSet;
	}

	// Parse Each Row of Data from Data Section
	
	public ArrayList<String> parseDataRows(ArrayList<String> singleGDSTDataList) {
		// Array Contains data for each row of each Single GDST as an index value

		String startAllData = "<list>";
		String endAllData = "</list>";

		ArrayList<Integer> startIndex = new ArrayList<Integer>();
		ArrayList<Integer> endIndex = new ArrayList<Integer>();
		ArrayList<String> dataSet = new ArrayList<String>();

		int fromIndex = 0;
		int endDataLength = endAllData.length();

		// For each gdst table List
		for (String gdstData : singleGDSTDataList) {

			// Find starting index of each list
			while ((fromIndex = gdstData.indexOf(startAllData, fromIndex)) != -1) {
				startIndex.add(fromIndex);
				fromIndex++;
			}

			// Find ending index of each list
			while ((fromIndex = gdstData.indexOf(endAllData, fromIndex)) != -1) {
				endIndex.add(fromIndex + endDataLength);
				fromIndex++;
			}

			// Parse each list
			for (int i = 0; i < startIndex.size(); i++) {

				String gdstSingleDataRow = gdstData.substring(startIndex.get(i), endIndex.get(i));
				dataSet.add(gdstSingleDataRow);
			}
		}

		return dataSet;
	}

	// Parse Each Row of Data from Data Section
	
	public ArrayList<ArrayList<String>> parseDataValues(ArrayList<String> rows) {
		// Array Contains data for each row of each Single GDST as an index value

		String startValueData = "<value>";
		String endValueData = "</value>";

		ArrayList<ArrayList<String>> dataSet = new ArrayList<ArrayList<String>>();

		int fromIndex = 0;
		int endDataLength = endValueData.length();

		// For each gdst table List
		for (String valueList : rows) {

			ArrayList<String> rowData = new ArrayList<String>();
			ArrayList<Integer> startIndex = new ArrayList<Integer>();
			ArrayList<Integer> endIndex = new ArrayList<Integer>();

			// Find starting index of each list
			while ((fromIndex = valueList.indexOf(startValueData, fromIndex)) != -1) {
				startIndex.add(fromIndex);
				fromIndex++;
			}

			// Find ending index of each list
			while ((fromIndex = valueList.indexOf(endValueData, fromIndex)) != -1) {
				endIndex.add(fromIndex + endDataLength);
				fromIndex++;
			}

			// Parse each list
			for (int i = 0; i < startIndex.size(); i++) {

				String gdstSingleDataRow = valueList.substring(startIndex.get(i), endIndex.get(i));
				rowData.add(gdstSingleDataRow);
			}

			dataSet.add(rowData);
		}

		return dataSet;
	}

	// Parse each field value
	
	public ArrayList<String> parseIndividualValues(ArrayList<String> cells) {

		int fromIndex = 0;
		int fromIndex2 = 0;

		ArrayList<String> parsedCells = new ArrayList<String>();
		ArrayList<String> data = new ArrayList<String>();

		for (String cell : cells) {
			StringBuilder sb = new StringBuilder(cell);

			// ArrayList<String> rowData = new ArrayList<String>();
			int startIndex = 0;
			int endIndex = 0;

			// Find starting index of each substring to delete
			while ((fromIndex = cell.indexOf("<dataType>", fromIndex)) != -1) {
				startIndex = fromIndex;
				fromIndex++;
				// System.out.println(startIndex);
			}

			// Find ending index of each substring to delete
			while ((fromIndex = cell.indexOf("</value>", fromIndex)) != -1) {
				endIndex = fromIndex + "</value>".length();
				fromIndex++;
			}

			// Removes <dataType></dataType>, <isOtherwise></isOtherwise>, and </value>
			sb.delete(startIndex, endIndex);
			String result = sb.toString();
			result = result.replaceAll("\n", " ");
			result = (result).replaceAll("\\s+", " ");

			parsedCells.add(result);
		}

		//Removes anything left within < >
		for (String cell : parsedCells) {
			StringBuilder sb = new StringBuilder(cell);
			ArrayList<Integer> startIndeces = new ArrayList<Integer>();
			ArrayList<Integer> endIndeces = new ArrayList<Integer>();

			while ((fromIndex2 = cell.indexOf("<", fromIndex2)) != -1) {
				startIndeces.add(fromIndex2);
				fromIndex2++;
			}

			while ((fromIndex2 = cell.indexOf(">", fromIndex2)) != -1) {
				endIndeces.add(fromIndex2 + 1);
				fromIndex2++;
			}

			for (int i = startIndeces.size() - 1; i >= 0; i--) {

				sb.delete(startIndeces.get(i), endIndeces.get(i));
				String result = sb.toString();
				(result).replaceAll("\\s+", " ");
			}
			
			//Replaces extra spaces
			String result = sb.toString();
			result = result.replaceAll("/[^A-Za-z0-9]/", "");

			//Adds bracket if result is a list
			if(result.contains(",")) {
				result = "[" + result + "]";
			}
			
			data.add(result);
		}

		return data;
	}
}
