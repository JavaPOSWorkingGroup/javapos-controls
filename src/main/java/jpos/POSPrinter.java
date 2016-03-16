//////////////////////////////////////////////////////////////////////
//
// The JavaPOS library source code is now under the CPL license, which 
// is an OSS Apache-like license. The complete license is located at:
//    http://www.ibm.com/developerworks/library/os-cpl.html
//
//////////////////////////////////////////////////////////////////////
//------------------------------------------------------------------------------
//
// This software is provided "AS IS".  The JavaPOS working group (including
// each of the Corporate members, contributors and individuals)  MAKES NO
// REPRESENTATIONS OR WARRANTIES ABOUT THE SUITABILITY OF THE SOFTWARE,
// EITHER EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE IMPLIED
// WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
// NON-INFRINGEMENT. The JavaPOS working group shall not be liable for
// any damages suffered as a result of using, modifying or distributing this
// software or its derivatives.Permission to use, copy, modify, and distribute
// the software and its documentation for any purpose is hereby granted.
//
// POSPrinter.java - A JavaPOS 1.6.0 device control
//
//------------------------------------------------------------------------------

package jpos;

import jpos.events.*;
import jpos.services.*;
import java.util.Vector;
import jpos.loader.*;

public class POSPrinter
   implements POSPrinterControl16, JposConst
{
    //--------------------------------------------------------------------------
    // Variables
    //--------------------------------------------------------------------------

    // Static Data
    protected static final String deviceControlDescription =
                                    "JavaPOS POSPrinter Device Control";
    protected static final int    deviceControlVersion = 1006000; // 1.6.0
    protected static final int    deviceVersion12 = 1002000; // 1.2.0
    protected static final int    deviceVersion13 = 1003000; // 1.3.0
    protected static final int    deviceVersion14 = 1004000; // 1.4.0
    protected static final int    deviceVersion15 = 1005000; // 1.5.0
    protected static final int    deviceVersion16 = 1006000; // 1.6.0

    // Instance Data
    protected JposServiceConnection serviceConnection;
    protected int serviceVersion;
    protected POSPrinterService12 service12;
    protected POSPrinterService13 service13;
    protected POSPrinterService14 service14;
    protected POSPrinterService15 service15;
    protected POSPrinterService16 service16;
    protected Vector directIOListeners;
    protected Vector errorListeners;
    protected Vector outputCompleteListeners;
    protected Vector statusUpdateListeners;

    //--------------------------------------------------------------------------
    // Constructor
    //--------------------------------------------------------------------------

    public POSPrinter()
    {
        serviceConnection = null;
        service12 = null;
        service13 = null;
        service14 = null;
        service15 = null;
        service16 = null;
        directIOListeners = new Vector();
        errorListeners = new Vector();
        outputCompleteListeners = new Vector();
        statusUpdateListeners = new Vector();
    }

    //--------------------------------------------------------------------------
    // Capabilities
    //--------------------------------------------------------------------------

    public int getCapCharacterSet()
        throws JposException
    {
        try
        {
            return service12.getCapCharacterSet();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public boolean getCapConcurrentJrnRec()
        throws JposException
    {
        try
        {
            return service12.getCapConcurrentJrnRec();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public boolean getCapConcurrentJrnSlp()
        throws JposException
    {
        try
        {
            return service12.getCapConcurrentJrnSlp();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public boolean getCapConcurrentRecSlp()
        throws JposException
    {
        try
        {
            return service12.getCapConcurrentRecSlp();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public boolean getCapCoverSensor()
        throws JposException
    {
        try
        {
            return service12.getCapCoverSensor();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public boolean getCapJrn2Color()
        throws JposException
    {
        try
        {
            return service12.getCapJrn2Color();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public boolean getCapJrnBold()
        throws JposException
    {
        try
        {
            return service12.getCapJrnBold();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public boolean getCapJrnDhigh()
        throws JposException
    {
        try
        {
            return service12.getCapJrnDhigh();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public boolean getCapJrnDwide()
        throws JposException
    {
        try
        {
            return service12.getCapJrnDwide();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public boolean getCapJrnDwideDhigh()
        throws JposException
    {
        try
        {
            return service12.getCapJrnDwideDhigh();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public boolean getCapJrnEmptySensor()
        throws JposException
    {
        try
        {
            return service12.getCapJrnEmptySensor();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public boolean getCapJrnItalic()
        throws JposException
    {
        try
        {
            return service12.getCapJrnItalic();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public boolean getCapJrnNearEndSensor()
        throws JposException
    {
        try
        {
            return service12.getCapJrnNearEndSensor();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public boolean getCapJrnPresent()
        throws JposException
    {
        try
        {
            return service12.getCapJrnPresent();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public boolean getCapJrnUnderline()
        throws JposException
    {
        try
        {
            return service12.getCapJrnUnderline();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public boolean getCapRec2Color()
        throws JposException
    {
        try
        {
            return service12.getCapRec2Color();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public boolean getCapRecBarCode()
        throws JposException
    {
        try
        {
            return service12.getCapRecBarCode();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public boolean getCapRecBitmap()
        throws JposException
    {
        try
        {
            return service12.getCapRecBitmap();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public boolean getCapRecBold()
        throws JposException
    {
        try
        {
            return service12.getCapRecBold();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public boolean getCapRecDhigh()
        throws JposException
    {
        try
        {
            return service12.getCapRecDhigh();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public boolean getCapRecDwide()
        throws JposException
    {
        try
        {
            return service12.getCapRecDwide();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public boolean getCapRecDwideDhigh()
        throws JposException
    {
        try
        {
            return service12.getCapRecDwideDhigh();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public boolean getCapRecEmptySensor()
        throws JposException
    {
        try
        {
            return service12.getCapRecEmptySensor();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public boolean getCapRecItalic()
        throws JposException
    {
        try
        {
            return service12.getCapRecItalic();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public boolean getCapRecLeft90()
        throws JposException
    {
        try
        {
            return service12.getCapRecLeft90();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public boolean getCapRecNearEndSensor()
        throws JposException
    {
        try
        {
            return service12.getCapRecNearEndSensor();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public boolean getCapRecPapercut()
        throws JposException
    {
        try
        {
            return service12.getCapRecPapercut();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public boolean getCapRecPresent()
        throws JposException
    {
        try
        {
            return service12.getCapRecPresent();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public boolean getCapRecRight90()
        throws JposException
    {
        try
        {
            return service12.getCapRecRight90();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public boolean getCapRecRotate180()
        throws JposException
    {
        try
        {
            return service12.getCapRecRotate180();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public boolean getCapRecStamp()
        throws JposException
    {
        try
        {
            return service12.getCapRecStamp();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public boolean getCapRecUnderline()
        throws JposException
    {
        try
        {
            return service12.getCapRecUnderline();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public boolean getCapSlp2Color()
        throws JposException
    {
        try
        {
            return service12.getCapSlp2Color();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public boolean getCapSlpBarCode()
        throws JposException
    {
        try
        {
            return service12.getCapSlpBarCode();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public boolean getCapSlpBitmap()
        throws JposException
    {
        try
        {
            return service12.getCapSlpBitmap();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public boolean getCapSlpBold()
        throws JposException
    {
        try
        {
            return service12.getCapSlpBold();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public boolean getCapSlpDhigh()
        throws JposException
    {
        try
        {
            return service12.getCapSlpDhigh();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public boolean getCapSlpDwide()
        throws JposException
    {
        try
        {
            return service12.getCapSlpDwide();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public boolean getCapSlpDwideDhigh()
        throws JposException
    {
        try
        {
            return service12.getCapSlpDwideDhigh();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public boolean getCapSlpEmptySensor()
        throws JposException
    {
        try
        {
            return service12.getCapSlpEmptySensor();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public boolean getCapSlpFullslip()
        throws JposException
    {
        try
        {
            return service12.getCapSlpFullslip();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public boolean getCapSlpItalic()
        throws JposException
    {
        try
        {
            return service12.getCapSlpItalic();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public boolean getCapSlpLeft90()
        throws JposException
    {
        try
        {
            return service12.getCapSlpLeft90();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public boolean getCapSlpNearEndSensor()
        throws JposException
    {
        try
        {
            return service12.getCapSlpNearEndSensor();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public boolean getCapSlpPresent()
        throws JposException
    {
        try
        {
            return service12.getCapSlpPresent();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public boolean getCapSlpRight90()
        throws JposException
    {
        try
        {
            return service12.getCapSlpRight90();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public boolean getCapSlpRotate180()
        throws JposException
    {
        try
        {
            return service12.getCapSlpRotate180();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public boolean getCapSlpUnderline()
        throws JposException
    {
        try
        {
            return service12.getCapSlpUnderline();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public boolean getCapTransaction()
        throws JposException
    {
        try
        {
            return service12.getCapTransaction();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public int getCapPowerReporting()
        throws JposException
    {
        // Attempt call to service if:
        //   1. The service supports the necessary service interface version
        //   2. The service is not open (this insures we fire the correct exception)
        if((service12 == null) || (serviceVersion >= deviceVersion13))
        {
            try
            {
                return service13.getCapPowerReporting();
            }
            catch(JposException je)
            {
                throw je;
            }
            catch(Exception e)
            {
                throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
            }
        }
        else
        {
            throw new JposException(JPOS_E_NOSERVICE,
                                    "Service does not support the POSPrinterControl13 interface");
        }
    }

    public int getCapJrnCartridgeSensor()
        throws JposException
    {
        // Attempt call to service if:
        //   1. The service supports the necessary service interface version
        //   2. The service is not open (this insures we fire the correct exception)
        if((service12 == null) || (serviceVersion >= deviceVersion15))
        {
            try
            {
                return service15.getCapJrnCartridgeSensor();
            }
            catch(JposException je)
            {
                throw je;
            }
            catch(Exception e)
            {
                throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
            }
        }
        else
        {
            throw new JposException(JPOS_E_NOSERVICE,
                                    "Service does not support the POSPrinterControl15 interface");
        }
    }

    public int getCapJrnColor()
        throws JposException
    {
        // Attempt call to service if:
        //   1. The service supports the necessary service interface version
        //   2. The service is not open (this insures we fire the correct exception)
        if((service12 == null) || (serviceVersion >= deviceVersion15))
        {
            try
            {
                return service15.getCapJrnColor();
            }
            catch(JposException je)
            {
                throw je;
            }
            catch(Exception e)
            {
                throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
            }
        }
        else
        {
            throw new JposException(JPOS_E_NOSERVICE,
                                    "Service does not support the POSPrinterControl15 interface");
        }
    }

    public int getCapRecCartridgeSensor()
        throws JposException
    {
        // Attempt call to service if:
        //   1. The service supports the necessary service interface version
        //   2. The service is not open (this insures we fire the correct exception)
        if((service12 == null) || (serviceVersion >= deviceVersion15))
        {
            try
            {
                return service15.getCapRecCartridgeSensor();
            }
            catch(JposException je)
            {
                throw je;
            }
            catch(Exception e)
            {
                throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
            }
        }
        else
        {
            throw new JposException(JPOS_E_NOSERVICE,
                                    "Service does not support the POSPrinterControl15 interface");
        }
    }

    public int getCapRecColor()
        throws JposException
    {
        // Attempt call to service if:
        //   1. The service supports the necessary service interface version
        //   2. The service is not open (this insures we fire the correct exception)
        if((service12 == null) || (serviceVersion >= deviceVersion15))
        {
            try
            {
                return service15.getCapRecColor();
            }
            catch(JposException je)
            {
                throw je;
            }
            catch(Exception e)
            {
                throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
            }
        }
        else
        {
            throw new JposException(JPOS_E_NOSERVICE,
                                    "Service does not support the POSPrinterControl15 interface");
        }
    }

    public int getCapRecMarkFeed()
        throws JposException
    {
        // Attempt call to service if:
        //   1. The service supports the necessary service interface version
        //   2. The service is not open (this insures we fire the correct exception)
        if((service12 == null) || (serviceVersion >= deviceVersion15))
        {
            try
            {
                return service15.getCapRecMarkFeed();
            }
            catch(JposException je)
            {
                throw je;
            }
            catch(Exception e)
            {
                throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
            }
        }
        else
        {
            throw new JposException(JPOS_E_NOSERVICE,
                                    "Service does not support the POSPrinterControl15 interface");
        }
    }

    public boolean getCapSlpBothSidesPrint()
        throws JposException
    {
        // Attempt call to service if:
        //   1. The service supports the necessary service interface version
        //   2. The service is not open (this insures we fire the correct exception)
        if((service12 == null) || (serviceVersion >= deviceVersion15))
        {
            try
            {
                return service15.getCapSlpBothSidesPrint();
            }
            catch(JposException je)
            {
                throw je;
            }
            catch(Exception e)
            {
                throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
            }
        }
        else
        {
            throw new JposException(JPOS_E_NOSERVICE,
                                    "Service does not support the POSPrinterControl15 interface");
        }
    }

    public int getCapSlpCartridgeSensor()
        throws JposException
    {
        // Attempt call to service if:
        //   1. The service supports the necessary service interface version
        //   2. The service is not open (this insures we fire the correct exception)
        if((service12 == null) || (serviceVersion >= deviceVersion15))
        {
            try
            {
                return service15.getCapSlpCartridgeSensor();
            }
            catch(JposException je)
            {
                throw je;
            }
            catch(Exception e)
            {
                throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
            }
        }
        else
        {
            throw new JposException(JPOS_E_NOSERVICE,
                                    "Service does not support the POSPrinterControl15 interface");
        }
    }

    public int getCapSlpColor()
        throws JposException
    {
        // Attempt call to service if:
        //   1. The service supports the necessary service interface version
        //   2. The service is not open (this insures we fire the correct exception)
        if((service12 == null) || (serviceVersion >= deviceVersion15))
        {
            try
            {
                return service15.getCapSlpColor();
            }
            catch(JposException je)
            {
                throw je;
            }
            catch(Exception e)
            {
                throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
            }
        }
        else
        {
            throw new JposException(JPOS_E_NOSERVICE,
                                    "Service does not support the POSPrinterControl15 interface");
        }
    }

    //--------------------------------------------------------------------------
    // Properties
    //--------------------------------------------------------------------------

    public String getCheckHealthText()
        throws JposException
    {
        try
        {
            return service12.getCheckHealthText();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public boolean getClaimed()
        throws JposException
    {
        try
        {
            return service12.getClaimed();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public String getDeviceControlDescription()
    {
        return deviceControlDescription;
    }

    public int getDeviceControlVersion()
    {
        return deviceControlVersion;
    }

    public boolean getDeviceEnabled()
        throws JposException
    {
        try
        {
            return service12.getDeviceEnabled();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public void setDeviceEnabled(boolean deviceEnabled)
        throws JposException
    {
        try
        {
            service12.setDeviceEnabled(deviceEnabled);
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public String getDeviceServiceDescription()
        throws JposException
    {
        try
        {
            return service12.getDeviceServiceDescription();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public int getDeviceServiceVersion()
        throws JposException
    {
        try
        {
            return service12.getDeviceServiceVersion();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public boolean getFreezeEvents()
        throws JposException
    {
        try
        {
            return service12.getFreezeEvents();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public void setFreezeEvents(boolean freezeEvents)
        throws JposException
    {
        try
        {
            service12.setFreezeEvents(freezeEvents);
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public String getPhysicalDeviceDescription()
        throws JposException
    {
        try
        {
            return service12.getPhysicalDeviceDescription();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public String getPhysicalDeviceName()
        throws JposException
    {
        try
        {
            return service12.getPhysicalDeviceName();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public int getState()
    {
        try
        {
            return service12.getState();
        }
        catch(Exception e)
        {
            return JPOS_S_CLOSED;
        }
    }

    public boolean getAsyncMode()
        throws JposException
    {
        try
        {
            return service12.getAsyncMode();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public void setAsyncMode(boolean asyncMode)
        throws JposException
    {
        try
        {
            service12.setAsyncMode(asyncMode);
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public int getCharacterSet()
        throws JposException
    {
        try
        {
            return service12.getCharacterSet();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public void setCharacterSet(int characterSet)
        throws JposException
    {
        try
        {
            service12.setCharacterSet(characterSet);
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public String getCharacterSetList()
        throws JposException
    {
        try
        {
            return service12.getCharacterSetList();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public boolean getCoverOpen()
        throws JposException
    {
        try
        {
            return service12.getCoverOpen();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public int getErrorLevel()
        throws JposException
    {
        try
        {
            return service12.getErrorLevel();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public int getErrorStation()
        throws JposException
    {
        try
        {
            return service12.getErrorStation();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public String getErrorString()
        throws JposException
    {
        try
        {
            return service12.getErrorString();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public boolean getFlagWhenIdle()
        throws JposException
    {
        try
        {
            return service12.getFlagWhenIdle();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public void setFlagWhenIdle(boolean flagWhenIdle)
        throws JposException
    {
        try
        {
            service12.setFlagWhenIdle(flagWhenIdle);
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public String getFontTypefaceList()
        throws JposException
    {
        try
        {
            return service12.getFontTypefaceList();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public boolean getJrnEmpty()
        throws JposException
    {
        try
        {
            return service12.getJrnEmpty();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public boolean getJrnLetterQuality()
        throws JposException
    {
        try
        {
            return service12.getJrnLetterQuality();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public void setJrnLetterQuality(boolean jrnLetterQuality)
        throws JposException
    {
        try
        {
            service12.setJrnLetterQuality(jrnLetterQuality);
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public int getJrnLineChars()
        throws JposException
    {
        try
        {
            return service12.getJrnLineChars();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public void setJrnLineChars(int jrnLineChars)
        throws JposException
    {
        try
        {
            service12.setJrnLineChars(jrnLineChars);
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public String getJrnLineCharsList()
        throws JposException
    {
        try
        {
            return service12.getJrnLineCharsList();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public int getJrnLineHeight()
        throws JposException
    {
        try
        {
            return service12.getJrnLineHeight();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public void setJrnLineHeight(int jrnLineHeight)
        throws JposException
    {
        try
        {
            service12.setJrnLineHeight(jrnLineHeight);
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public int getJrnLineSpacing()
        throws JposException
    {
        try
        {
            return service12.getJrnLineSpacing();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public void setJrnLineSpacing(int jrnLineSpacing)
        throws JposException
    {
        try
        {
            service12.setJrnLineSpacing(jrnLineSpacing);
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public int getJrnLineWidth()
        throws JposException
    {
        try
        {
            return service12.getJrnLineWidth();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public boolean getJrnNearEnd()
        throws JposException
    {
        try
        {
            return service12.getJrnNearEnd();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public int getMapMode()
        throws JposException
    {
        try
        {
            return service12.getMapMode();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public void setMapMode(int mapMode)
        throws JposException
    {
        try
        {
            service12.setMapMode(mapMode);
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public int getOutputID()
        throws JposException
    {
        try
        {
            return service12.getOutputID();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public String getRecBarCodeRotationList()
        throws JposException
    {
        try
        {
            return service12.getRecBarCodeRotationList();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public boolean getRecEmpty()
        throws JposException
    {
        try
        {
            return service12.getRecEmpty();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public boolean getRecLetterQuality()
        throws JposException
    {
        try
        {
            return service12.getRecLetterQuality();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public void setRecLetterQuality(boolean recLetterQuality)
        throws JposException
    {
        try
        {
            service12.setRecLetterQuality(recLetterQuality);
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public int getRecLineChars()
        throws JposException
    {
        try
        {
            return service12.getRecLineChars();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public void setRecLineChars(int recLineChars)
        throws JposException
    {
        try
        {
            service12.setRecLineChars(recLineChars);
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public String getRecLineCharsList()
        throws JposException
    {
        try
        {
            return service12.getRecLineCharsList();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public int getRecLineHeight()
        throws JposException
    {
        try
        {
            return service12.getRecLineHeight();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public void setRecLineHeight(int recLineHeight)
        throws JposException
    {
        try
        {
            service12.setRecLineHeight(recLineHeight);
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public int getRecLineSpacing()
        throws JposException
    {
        try
        {
            return service12.getRecLineSpacing();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public void setRecLineSpacing(int recLineSpacing)
        throws JposException
    {
        try
        {
            service12.setRecLineSpacing(recLineSpacing);
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public int getRecLinesToPaperCut()
        throws JposException
    {
        try
        {
            return service12.getRecLinesToPaperCut();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public int getRecLineWidth()
        throws JposException
    {
        try
        {
            return service12.getRecLineWidth();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public boolean getRecNearEnd()
        throws JposException
    {
        try
        {
            return service12.getRecNearEnd();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public int getRecSidewaysMaxChars()
        throws JposException
    {
        try
        {
            return service12.getRecSidewaysMaxChars();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public int getRecSidewaysMaxLines()
        throws JposException
    {
        try
        {
            return service12.getRecSidewaysMaxLines();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public int getRotateSpecial()
        throws JposException
    {
        try
        {
            return service12.getRotateSpecial();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public void setRotateSpecial(int rotateSpecial)
        throws JposException
    {
        try
        {
            service12.setRotateSpecial(rotateSpecial);
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public String getSlpBarCodeRotationList()
        throws JposException
    {
        try
        {
            return service12.getSlpBarCodeRotationList();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public boolean getSlpEmpty()
        throws JposException
    {
        try
        {
            return service12.getSlpEmpty();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public boolean getSlpLetterQuality()
        throws JposException
    {
        try
        {
            return service12.getSlpLetterQuality();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public void setSlpLetterQuality(boolean recLetterQuality)
        throws JposException
    {
        try
        {
            service12.setSlpLetterQuality(recLetterQuality);
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public int getSlpLineChars()
        throws JposException
    {
        try
        {
            return service12.getSlpLineChars();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public void setSlpLineChars(int recLineChars)
        throws JposException
    {
        try
        {
            service12.setSlpLineChars(recLineChars);
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public String getSlpLineCharsList()
        throws JposException
    {
        try
        {
            return service12.getSlpLineCharsList();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public int getSlpLineHeight()
        throws JposException
    {
        try
        {
            return service12.getSlpLineHeight();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public void setSlpLineHeight(int recLineHeight)
        throws JposException
    {
        try
        {
            service12.setSlpLineHeight(recLineHeight);
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public int getSlpLinesNearEndToEnd()
        throws JposException
    {
        try
        {
            return service12.getSlpLinesNearEndToEnd();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public int getSlpLineSpacing()
        throws JposException
    {
        try
        {
            return service12.getSlpLineSpacing();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public void setSlpLineSpacing(int recLineSpacing)
        throws JposException
    {
        try
        {
            service12.setSlpLineSpacing(recLineSpacing);
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public int getSlpLineWidth()
        throws JposException
    {
        try
        {
            return service12.getSlpLineWidth();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public int getSlpMaxLines()
        throws JposException
    {
        try
        {
            return service12.getSlpMaxLines();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public boolean getSlpNearEnd()
        throws JposException
    {
        try
        {
            return service12.getSlpNearEnd();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public int getSlpSidewaysMaxChars()
        throws JposException
    {
        try
        {
            return service12.getSlpSidewaysMaxChars();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public int getSlpSidewaysMaxLines()
        throws JposException
    {
        try
        {
            return service12.getSlpSidewaysMaxLines();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public int getPowerNotify()
        throws JposException
    {
        // Attempt call to service if:
        //   1. The service supports the necessary service interface version
        //   2. The service is not open (this insures we fire the correct exception)
        if((service12 == null) || (serviceVersion >= deviceVersion13))
        {
            try
            {
                return service13.getPowerNotify();
            }
            catch(JposException je)
            {
                throw je;
            }
            catch(Exception e)
            {
                throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
            }
        }
        else
        {
            throw new JposException(JPOS_E_NOSERVICE,
                                    "Service does not support the POSPrinterControl13 interface");
        }
    }

    public void setPowerNotify(int powerNotify)
        throws JposException
    {
        // Attempt call to service if:
        //   1. The service supports the necessary service interface version
        //   2. The service is not open (this insures we fire the correct exception)
        if((service12 == null) || (serviceVersion >= deviceVersion13))
        {
            try
            {
                service13.setPowerNotify(powerNotify);
            }
            catch(JposException je)
            {
                throw je;
            }
            catch(Exception e)
            {
                throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
            }
        }
        else
        {
            throw new JposException(JPOS_E_NOSERVICE,
                                    "Service does not support the POSPrinterControl13 interface");
        }
    }

    public int getPowerState()
        throws JposException
    {
        // Attempt call to service if:
        //   1. The service supports the necessary service interface version
        //   2. The service is not open (this insures we fire the correct exception)
        if((service12 == null) || (serviceVersion >= deviceVersion13))
        {
            try
            {
                return service13.getPowerState();
            }
            catch(JposException je)
            {
                throw je;
            }
            catch(Exception e)
            {
                throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
            }
        }
        else
        {
            throw new JposException(JPOS_E_NOSERVICE,
                                    "Service does not support the POSPrinterControl13 interface");
        }
    }

    public int getCartridgeNotify()
        throws JposException
    {
        // Attempt call to service if:
        //   1. The service supports the necessary service interface version
        //   2. The service is not open (this insures we fire the correct exception)
        if((service12 == null) || (serviceVersion >= deviceVersion15))
        {
            try
            {
                return service15.getCartridgeNotify();
            }
            catch(JposException je)
            {
                throw je;
            }
            catch(Exception e)
            {
                throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
            }
        }
        else
        {
            throw new JposException(JPOS_E_NOSERVICE,
                                    "Service does not support the POSPrinterControl15 interface");
        }
    }

    public void setCartridgeNotify(int notify)
        throws JposException
    {
        // Attempt call to service if:
        //   1. The service supports the necessary service interface version
        //   2. The service is not open (this insures we fire the correct exception)
        if((service12 == null) || (serviceVersion >= deviceVersion15))
        {
            try
            {
                service15.setCartridgeNotify(notify);
            }
            catch(JposException je)
            {
                throw je;
            }
            catch(Exception e)
            {
                throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
            }
        }
        else
        {
            throw new JposException(JPOS_E_NOSERVICE,
                                    "Service does not support the POSPrinterControl15 interface");
        }
    }

    public int getJrnCartridgeState()
        throws JposException
    {
        // Attempt call to service if:
        //   1. The service supports the necessary service interface version
        //   2. The service is not open (this insures we fire the correct exception)
        if((service12 == null) || (serviceVersion >= deviceVersion15))
        {
            try
            {
                return service15.getJrnCartridgeState();
            }
            catch(JposException je)
            {
                throw je;
            }
            catch(Exception e)
            {
                throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
            }
        }
        else
        {
            throw new JposException(JPOS_E_NOSERVICE,
                                    "Service does not support the POSPrinterControl15 interface");
        }
    }

    public int getJrnCurrentCartridge()
        throws JposException
    {
        // Attempt call to service if:
        //   1. The service supports the necessary service interface version
        //   2. The service is not open (this insures we fire the correct exception)
        if((service12 == null) || (serviceVersion >= deviceVersion15))
        {
            try
            {
                return service15.getJrnCurrentCartridge();
            }
            catch(JposException je)
            {
                throw je;
            }
            catch(Exception e)
            {
                throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
            }
        }
        else
        {
            throw new JposException(JPOS_E_NOSERVICE,
                                    "Service does not support the POSPrinterControl15 interface");
        }
    }

    public void setJrnCurrentCartridge(int cartridge)
        throws JposException
    {
        // Attempt call to service if:
        //   1. The service supports the necessary service interface version
        //   2. The service is not open (this insures we fire the correct exception)
        if((service12 == null) || (serviceVersion >= deviceVersion15))
        {
            try
            {
                service15.setJrnCurrentCartridge(cartridge);
            }
            catch(JposException je)
            {
                throw je;
            }
            catch(Exception e)
            {
                throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
            }
        }
        else
        {
            throw new JposException(JPOS_E_NOSERVICE,
                                    "Service does not support the POSPrinterControl15 interface");
        }
    }

    public int getRecCartridgeState()
        throws JposException
    {
        // Attempt call to service if:
        //   1. The service supports the necessary service interface version
        //   2. The service is not open (this insures we fire the correct exception)
        if((service12 == null) || (serviceVersion >= deviceVersion15))
        {
            try
            {
                return service15.getRecCartridgeState();
            }
            catch(JposException je)
            {
                throw je;
            }
            catch(Exception e)
            {
                throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
            }
        }
        else
        {
            throw new JposException(JPOS_E_NOSERVICE,
                                    "Service does not support the POSPrinterControl15 interface");
        }
    }

    public int getRecCurrentCartridge()
        throws JposException
    {
        // Attempt call to service if:
        //   1. The service supports the necessary service interface version
        //   2. The service is not open (this insures we fire the correct exception)
        if((service12 == null) || (serviceVersion >= deviceVersion15))
        {
            try
            {
                return service15.getRecCurrentCartridge();
            }
            catch(JposException je)
            {
                throw je;
            }
            catch(Exception e)
            {
                throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
            }
        }
        else
        {
            throw new JposException(JPOS_E_NOSERVICE,
                                    "Service does not support the POSPrinterControl15 interface");
        }
    }

    public void setRecCurrentCartridge(int cartridge)
        throws JposException
    {
        // Attempt call to service if:
        //   1. The service supports the necessary service interface version
        //   2. The service is not open (this insures we fire the correct exception)
        if((service12 == null) || (serviceVersion >= deviceVersion15))
        {
            try
            {
                service15.setRecCurrentCartridge(cartridge);
            }
            catch(JposException je)
            {
                throw je;
            }
            catch(Exception e)
            {
                throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
            }
        }
        else
        {
            throw new JposException(JPOS_E_NOSERVICE,
                                    "Service does not support the POSPrinterControl15 interface");
        }
    }

    public int getSlpCartridgeState()
        throws JposException
    {
        // Attempt call to service if:
        //   1. The service supports the necessary service interface version
        //   2. The service is not open (this insures we fire the correct exception)
        if((service12 == null) || (serviceVersion >= deviceVersion15))
        {
            try
            {
                return service15.getSlpCartridgeState();
            }
            catch(JposException je)
            {
                throw je;
            }
            catch(Exception e)
            {
                throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
            }
        }
        else
        {
            throw new JposException(JPOS_E_NOSERVICE,
                                    "Service does not support the POSPrinterControl15 interface");
        }
    }

    public int getSlpCurrentCartridge()
        throws JposException
    {
        // Attempt call to service if:
        //   1. The service supports the necessary service interface version
        //   2. The service is not open (this insures we fire the correct exception)
        if((service12 == null) || (serviceVersion >= deviceVersion15))
        {
            try
            {
                return service15.getSlpCurrentCartridge();
            }
            catch(JposException je)
            {
                throw je;
            }
            catch(Exception e)
            {
                throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
            }
        }
        else
        {
            throw new JposException(JPOS_E_NOSERVICE,
                                    "Service does not support the POSPrinterControl15 interface");
        }
    }

    public void setSlpCurrentCartridge(int cartridge)
        throws JposException
    {
        // Attempt call to service if:
        //   1. The service supports the necessary service interface version
        //   2. The service is not open (this insures we fire the correct exception)
        if((service12 == null) || (serviceVersion >= deviceVersion15))
        {
            try
            {
                service15.setSlpCurrentCartridge(cartridge);
            }
            catch(JposException je)
            {
                throw je;
            }
            catch(Exception e)
            {
                throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
            }
        }
        else
        {
            throw new JposException(JPOS_E_NOSERVICE,
                                    "Service does not support the POSPrinterControl15 interface");
        }
    }

    public int getSlpPrintSide()
        throws JposException
    {
        // Attempt call to service if:
        //   1. The service supports the necessary service interface version
        //   2. The service is not open (this insures we fire the correct exception)
        if((service12 == null) || (serviceVersion >= deviceVersion15))
        {
            try
            {
                return service15.getSlpPrintSide();
            }
            catch(JposException je)
            {
                throw je;
            }
            catch(Exception e)
            {
                throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
            }
        }
        else
        {
            throw new JposException(JPOS_E_NOSERVICE,
                                    "Service does not support the POSPrinterControl15 interface");
        }
    }

    //--------------------------------------------------------------------------
    // Methods
    //--------------------------------------------------------------------------

    public void claim(int timeout)
        throws JposException
    {
        try
        {
            service12.claim(timeout);
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public synchronized void close()
        throws JposException
    {
        try
        {
            service12.close();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED,
                                    "Service not open",
                                    e);
        }

        try
        {
            serviceConnection.disconnect();
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_NOSERVICE,
                                    "Unable to free service connection",
                                    e);
        }
        finally
        {
            service12 = null;
            service13 = null;
            service14 = null;
            service15 = null;
            service16 = null;
        }
    }

    public void checkHealth(int level)
        throws JposException
    {
        try
        {
            service12.checkHealth(level);
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public void directIO(int command, int[] data, Object object)
        throws JposException
    {
        try
        {
            service12.directIO(command, data, object);
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public synchronized void open(String logicalDeviceName)
        throws JposException
    {
        // Make sure the control is not already open
        if(service12 != null)
        {
            throw new JposException(JPOS_E_ILLEGAL,
                                    "Device control already open");
        }

        // Use JCL to get a connection to the device service
        try
        {
            serviceConnection = JposServiceLoader.findService(logicalDeviceName);
            serviceConnection.connect();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_NOSERVICE,
                                    "Could not connect to service",
                                    e);
        }

        // Get an instance of the minimum service level supported
        try
        {
            service12 = (POSPrinterService12)serviceConnection.getService();
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_NOSERVICE,
                                    "Could not get service instance",
                                    e);
        }

        // Get service version
        try
        {
            serviceVersion = service12.getDeviceServiceVersion();
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_NOSERVICE,
                                    "Could not get service version information",
                                    e);
        }

        // Make sure that the service actually conforms to the interfaces it
        // claims to.
        if(serviceVersion >= deviceVersion13)
        {
            try
            {
                service13 = (POSPrinterService13)service12;
            }
            catch(Exception e)
            {
                throw new JposException(JPOS_E_NOSERVICE,
                                        "Service does not fully implement POSPrinterDevice13 interface",
                                        e);
            }
        }

        if(serviceVersion >= deviceVersion14)
        {
            try
            {
                service14 = (POSPrinterService14)service12;
            }
            catch(Exception e)
            {
                throw new JposException(JPOS_E_NOSERVICE,
                                        "Service does not fully implement POSPrinterDevice14 interface",
                                        e);
            }
        }

        if(serviceVersion >= deviceVersion15)
        {
            try
            {
                service15 = (POSPrinterService15)service12;
            }
            catch(Exception e)
            {
                throw new JposException(JPOS_E_NOSERVICE,
                                        "Service does not fully implement POSPrinterDevice15 interface",
                                        e);
            }
        }

        if(serviceVersion >= deviceVersion16)
        {
            try
            {
                service16 = (POSPrinterService16)service12;
            }
            catch(Exception e)
            {
                throw new JposException(JPOS_E_NOSERVICE,
                                        "Service does not fully implement POSPrinterDevice16 interface",
                                        e);
            }
        }

        // Create callback subclass and attach it to the device service
        POSPrinterCallbacks callbacks = this.new POSPrinterCallbacks();
        service12.open(logicalDeviceName, callbacks);
    }

    public void release()
        throws JposException
    {
        try
        {
            service12.release();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public void beginInsertion(int timeout)
        throws JposException
    {
        try
        {
            service12.beginInsertion(timeout);
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public void beginRemoval(int timeout)
        throws JposException
    {
        try
        {
            service12.beginRemoval(timeout);
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public void clearOutput()
        throws JposException
    {
        try
        {
            service12.clearOutput();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public void cutPaper(int percentage)
        throws JposException
    {
        try
        {
            service12.cutPaper(percentage);
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public void endInsertion()
        throws JposException
    {
        try
        {
            service12.endInsertion();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public void endRemoval()
        throws JposException
    {
        try
        {
            service12.endRemoval();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public void printBarCode(int station, String data, int symbology, int height, int width, int alignment, int textPosition)
        throws JposException
    {
        try
        {
            service12.printBarCode(station, data, symbology, height, width, alignment, textPosition);
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public void printBitmap(int station, String fileName, int width, int alignment)
        throws JposException
    {
        try
        {
            service12.printBitmap(station, fileName, width, alignment);
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public void printImmediate(int station, String data)
        throws JposException
    {
        try
        {
            service12.printImmediate(station, data);
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public void printNormal(int station, String data)
        throws JposException
    {
        try
        {
            service12.printNormal(station, data);
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public void printTwoNormal(int stations, String data1, String data2)
        throws JposException
    {
        try
        {
            service12.printTwoNormal(stations, data1, data2);
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public void rotatePrint(int station, int rotation)
        throws JposException
    {
        try
        {
            service12.rotatePrint(station, rotation);
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public void setBitmap(int bitmapNumber, int station, String fileName, int width, int alignment)
        throws JposException
    {
        try
        {
            service12.setBitmap(bitmapNumber, station, fileName, width, alignment);
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public void setLogo(int location, String data)
        throws JposException
    {
        try
        {
            service12.setLogo(location, data);
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public void transactionPrint(int station, int control)
        throws JposException
    {
        try
        {
            service12.transactionPrint(station, control);
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public void validateData(int station, String data)
        throws JposException
    {
        try
        {
            service12.validateData(station, data);
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public void changePrintSide(int side)
        throws JposException
    {
        // Attempt call to service if:
        //   1. The service supports the necessary service interface version
        //   2. The service is not open (this insures we fire the correct exception)
        if((service12 == null) || (serviceVersion >= deviceVersion15))
        {
            try
            {
                service15.changePrintSide(side);
            }
            catch(JposException je)
            {
                throw je;
            }
            catch(Exception e)
            {
                throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
            }
        }
        else
        {
            throw new JposException(JPOS_E_NOSERVICE,
                                    "Service does not support the POSPrinterControl15 interface");
        }
    }

    public void markFeed(int type)
        throws JposException
    {
        // Attempt call to service if:
        //   1. The service supports the necessary service interface version
        //   2. The service is not open (this insures we fire the correct exception)
        if((service12 == null) || (serviceVersion >= deviceVersion15))
        {
            try
            {
                service15.markFeed(type);
            }
            catch(JposException je)
            {
                throw je;
            }
            catch(Exception e)
            {
                throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
            }
        }
        else
        {
            throw new JposException(JPOS_E_NOSERVICE,
                                    "Service does not support the POSPrinterControl15 interface");
        }
    }

    //--------------------------------------------------------------------------
    // Event Listener Methods
    //--------------------------------------------------------------------------

    public void addDirectIOListener(DirectIOListener l)
    {
        synchronized(directIOListeners)
        {
            directIOListeners.addElement(l);
        }
    }

    public void removeDirectIOListener(DirectIOListener l)
    {
        synchronized(directIOListeners)
        {
            directIOListeners.removeElement(l);
        }
    }

    public void addErrorListener(ErrorListener l)
    {
        synchronized(errorListeners)
        {
            errorListeners.addElement(l);
        }
    }

    public void removeErrorListener(ErrorListener l)
    {
        synchronized(errorListeners)
        {
            errorListeners.removeElement(l);
        }
    }

    public void addOutputCompleteListener(OutputCompleteListener l)
    {
        synchronized(outputCompleteListeners)
        {
            outputCompleteListeners.addElement(l);
        }
    }

    public void removeOutputCompleteListener(OutputCompleteListener l)
    {
        synchronized(outputCompleteListeners)
        {
            outputCompleteListeners.removeElement(l);
        }
    }

    public void addStatusUpdateListener(StatusUpdateListener l)
    {
        synchronized(statusUpdateListeners)
        {
            statusUpdateListeners.addElement(l);
        }
    }

    public void removeStatusUpdateListener(StatusUpdateListener l)
    {
        synchronized(statusUpdateListeners)
        {
            statusUpdateListeners.removeElement(l);
        }
    }

    //--------------------------------------------------------------------------
    // EventCallbacks inner class
    //--------------------------------------------------------------------------
    protected class POSPrinterCallbacks implements EventCallbacks
    {
        public BaseControl getEventSource()
        {
            return (BaseControl)POSPrinter.this;
        }

        public void fireDataEvent(DataEvent e)
        {
        }

        public void fireDirectIOEvent(DirectIOEvent e)
        {
            synchronized(POSPrinter.this.directIOListeners)
            {
                // deliver the event to all registered listeners
                for(int x = 0; x < directIOListeners.size(); x++)
                {
                    ((DirectIOListener)directIOListeners.elementAt(x)).directIOOccurred(e);
                }
            }
        }

        public void fireErrorEvent(ErrorEvent e)
        {
            synchronized(POSPrinter.this.errorListeners)
            {
                // deliver the event to all registered listeners
                for(int x = 0; x < errorListeners.size(); x++)
                {
                    ((ErrorListener)errorListeners.elementAt(x)).errorOccurred(e);
                }
            }
        }

        public void fireOutputCompleteEvent(OutputCompleteEvent e)
        {
            synchronized(POSPrinter.this.outputCompleteListeners)
            {
                // deliver the event to all registered listeners
                for(int x = 0; x < outputCompleteListeners.size(); x++)
                {
                    ((OutputCompleteListener)outputCompleteListeners.elementAt(x)).outputCompleteOccurred(e);
                }
            }
        }

        public void fireStatusUpdateEvent(StatusUpdateEvent e)
        {
            synchronized(POSPrinter.this.statusUpdateListeners)
            {
                // deliver the event to all registered listeners
                for(int x = 0; x < statusUpdateListeners.size(); x++)
                {
                    ((StatusUpdateListener)statusUpdateListeners.elementAt(x)).statusUpdateOccurred(e);
                }
            }
        }
    }
}
