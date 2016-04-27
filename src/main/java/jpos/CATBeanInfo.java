//////////////////////////////////////////////////////////////////////
//
// The JavaPOS library source code is now under the CPL license, which 
// is an OSS Apache-like license. The complete license is located at:
//    http://www.ibm.com/developerworks/library/os-cpl.html
//
//////////////////////////////////////////////////////////////////////
//------------------------------------------------------------------------------
//
// THIS SOFTWARE IS PROVIDED AS IS. THE JAVAPOS WORKING GROUP MAKES NO
// REPRESENTATIONS OR WARRANTIES ABOUT THE SUITABILITY OF THE SOFTWARE,
// EITHER EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE IMPLIED
// WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, OR
// NON-INFRINGEMENT.  INDIVIDUAL OR CORPORATE MEMBERS OF THE JAVAPOS
// WORKING GROUP SHALL NOT BE LIABLE FOR ANY DAMAGES SUFFERED AS A RESULT
// OF USING, MODIFYING OR DISTRIBUTING THIS SOFTWARE OR ITS DERIVATIVES.
//
// CATBeanInfo.java - Bean information for the JavaPOS CAT
//    device control
//
//------------------------------------------------------------------------------

package jpos;

import java.beans.*;
import java.lang.reflect.*;

public class CATBeanInfo
  extends SimpleBeanInfo
{
  public BeanDescriptor getBeanDescriptor()
  {
    return new BeanDescriptor(jpos.CAT.class);
  }

  public PropertyDescriptor makeProperty(String propertyName)
    throws IntrospectionException
  {
    return new PropertyDescriptor(propertyName, jpos.CAT.class);
  }

  public PropertyDescriptor[] getPropertyDescriptors()
  {
    try
    {
      PropertyDescriptor[] properties =
      {
        // Capabilities
        makeProperty("CapAdditionalSecurityInformation"),
        makeProperty("CapAuthorizeCompletion"),
        makeProperty("CapAuthorizePreSales"),
        makeProperty("CapAuthorizeRefund"),
        makeProperty("CapAuthorizeVoid"),
        makeProperty("CapAuthorizeVoidPreSales"),
        makeProperty("CapCenterResultCode"),
        makeProperty("CapCheckCard"),
        makeProperty("CapDailyLog"),
        makeProperty("CapInstallments"),
        makeProperty("CapPaymentDetail"),
        makeProperty("CapPowerReporting"),
        makeProperty("CapTaxOthers"),
        makeProperty("CapTransactionNumber"),
        makeProperty("CapTrainingMode"),
        makeProperty("CapStatisticsReporting"),
        makeProperty("CapUpdateStatistics"),

        // Properties
        makeProperty("AccountNumber"),
        makeProperty("AdditionalSecurityInformation"),
        makeProperty("ApprovalCode"),
        makeProperty("AsyncMode"),
        makeProperty("CardCompanyID"),
        makeProperty("CenterResultCode"),
        makeProperty("DailyLog"),
        makeProperty("PaymentCondition"),
        makeProperty("PaymentDetail"),
        makeProperty("PowerNotify"),
        makeProperty("PowerState"),
        makeProperty("SequenceNumber"),
        makeProperty("SlipNumber"),
        makeProperty("TrainingMode"),
        makeProperty("TransactionNumber"),
        makeProperty("TransactionType"),
        makeProperty("PaymentMedia"),

      };

      return properties;
    }
    catch(Exception e)
    {
      return super.getPropertyDescriptors();
    }
  }

  public EventSetDescriptor makeEvent(String eventName)
    throws IntrospectionException, ClassNotFoundException
  {
    String listener = "jpos.events." + eventName + "Listener";
    return new EventSetDescriptor(jpos.CAT.class,
                                  eventName,
                                  Class.forName(listener),
                                  eventName + "Occurred");
  }

  public EventSetDescriptor[] getEventSetDescriptors()
  {
    try
    {
      EventSetDescriptor[] events =
      {
        makeEvent("DirectIO"),
        makeEvent("Error"),
        makeEvent("OutputComplete"),
        makeEvent("StatusUpdate")
      };

      return events;
    }
    catch(Exception e)
    {
      return super.getEventSetDescriptors();
    }
  }
}
