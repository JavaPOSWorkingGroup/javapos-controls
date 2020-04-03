////////////////////////////////////////////////////////////////////////////////
//
// The JavaPOS library source code is under the CPL license, which 
// is an OSS Apache-like license. The complete license is located at:
//    http://www.ibm.com/developerworks/library/os-cpl.html
//
//------------------------------------------------------------------------------
// This software is provided "AS IS".  The JavaPOS working group (including
// each of the Corporate members, contributors and individuals)  MAKES NO
// REPRESENTATIONS OR WARRANTIES ABOUT THE SUITABILITY OF THE SOFTWARE,
// EITHER EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE IMPLIED
// WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
// NON-INFRINGEMENT. The JavaPOS working group shall not be liable for
// any damages suffered as a result of using, modifying or distributing this
// software or its derivatives.Permission to use, copy, modify, and distribute
// the software and its documentation for any purpose is hereby granted.
////////////////////////////////////////////////////////////////////////////////

package jpos.services;

import jpos.JposConst;
import jpos.JposException;
import jpos.config.JposEntry;
import jpos.loader.JposServiceInstance;
import jpos.loader.JposServiceLoader;
import jpos.events.*;

/**
 * JavaPOS Device Service class, intended to be used for testing purposes in BiometricsTest.
 *
 */
public final class BiometricsTestService114 implements jpos.services.BiometricsService114, JposServiceInstance {
    
    private JposEntry configuration;
    private EventCallbacks callbacks;
    
    @Override
    public int getDeviceServiceVersion() throws JposException {
        if (configuration.hasPropertyWithName("returnVersionTooLarge"))
            return 1015000;
        else
            return 1014000;
    }
    
    @Override
    public int getState() throws JposException {
        return JposConst.JPOS_S_CLOSED;
    }

    @Override
    public void open(String logicalName, EventCallbacks cb) throws JposException {
        configuration = JposServiceLoader.getManager().getEntryRegistry().getJposEntry(logicalName);
        callbacks = cb;
    }

    @Override
    public void deleteInstance() throws JposException {
        // intentionally left empty
    }
    
    @Override
    public void directIO(int command, int[] data, Object object) throws JposException 
    {
        switch (command) {
        case jpos.ControlsTestHelper.SEND_DATA_EVENT:
            this.callbacks.fireDataEvent(new DataEvent(this.callbacks.getEventSource(), 0));
        case jpos.ControlsTestHelper.SEND_DIRECTIO_EVENT:
            this.callbacks.fireDirectIOEvent(new DirectIOEvent(this.callbacks.getEventSource(), 1, 2, null));
        case jpos.ControlsTestHelper.SEND_ERROR_EVENT:
            this.callbacks.fireErrorEvent(new ErrorEvent(this.callbacks.getEventSource(), 1, 2, 3, 4));
            break;
        case jpos.ControlsTestHelper.SEND_OUTPUTCOMPLETE_EVENT: 
            this.callbacks.fireOutputCompleteEvent(new OutputCompleteEvent(this.callbacks.getEventSource(), 1));
            break;
        case jpos.ControlsTestHelper.SEND_STATUSUPDATE_EVENT:
            this.callbacks.fireStatusUpdateEvent(new StatusUpdateEvent(this.callbacks.getEventSource(), 1));
            break;
        default:
            break;
        }
    }
    
    
    @Override
    public int getAlgorithm() throws JposException {
        return 0;
    }
    
    @Override
    public void setAlgorithm(int algorithm) throws JposException {
    }
    
    @Override
    public String getAlgorithmList() throws JposException {
        return "";
    }
    
    @Override
    public boolean getAutoDisable() throws JposException {
        return true;
    }
    
    @Override
    public void setAutoDisable(boolean autoDisable) throws JposException {
    }
    
    @Override
    public byte[] getBIR() throws JposException {
        return new byte[0];
    }
    
    @Override
    public boolean getCapCompareFirmwareVersion() throws JposException {
        return true;
    }
    
    @Override
    public int getCapPowerReporting() throws JposException {
        return 0;
    }
    
    @Override
    public boolean getCapPrematchData() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapRawSensorData() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapRealTimeData() throws JposException {
        return true;
    }
    
    @Override
    public int getCapSensorColor() throws JposException {
        return 0;
    }
    
    @Override
    public int getCapSensorOrientation() throws JposException {
        return 0;
    }
    
    @Override
    public int getCapSensorType() throws JposException {
        return 0;
    }
    
    @Override
    public boolean getCapStatisticsReporting() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapTemplateAdaptation() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapUpdateFirmware() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapUpdateStatistics() throws JposException {
        return true;
    }
    
    @Override
    public String getCheckHealthText() throws JposException {
        return "";
    }
    
    @Override
    public boolean getClaimed() throws JposException {
        return true;
    }
    
    @Override
    public int getDataCount() throws JposException {
        return 0;
    }
    
    @Override
    public boolean getDataEventEnabled() throws JposException {
        return true;
    }
    
    @Override
    public void setDataEventEnabled(boolean dataEventEnabled) throws JposException {
    }
    
    @Override
    public boolean getDeviceEnabled() throws JposException {
        return true;
    }
    
    @Override
    public void setDeviceEnabled(boolean deviceEnabled) throws JposException {
    }
    
    @Override
    public String getDeviceServiceDescription() throws JposException {
        return "";
    }
    
    @Override
    public boolean getFreezeEvents() throws JposException {
        return true;
    }
    
    @Override
    public void setFreezeEvents(boolean freezeEvents) throws JposException {
    }
    
    @Override
    public String getPhysicalDeviceDescription() throws JposException {
        return "";
    }
    
    @Override
    public String getPhysicalDeviceName() throws JposException {
        return "";
    }
    
    @Override
    public int getPowerNotify() throws JposException {
        return 0;
    }
    
    @Override
    public void setPowerNotify(int powerNotify) throws JposException {
    }
    
    @Override
    public int getPowerState() throws JposException {
        return 0;
    }
    
    @Override
    public byte[] getRawSensorData() throws JposException {
        return new byte[0];
    }
    
    @Override
    public boolean getRealTimeDataEnabled() throws JposException {
        return true;
    }
    
    @Override
    public void setRealTimeDataEnabled(boolean enabled) throws JposException {
    }
    
    @Override
    public int getSensorBPP() throws JposException {
        return 0;
    }
    
    @Override
    public int getSensorColor() throws JposException {
        return 0;
    }
    
    @Override
    public void setSensorColor(int color) throws JposException {
    }
    
    @Override
    public int getSensorHeight() throws JposException {
        return 0;
    }
    
    @Override
    public int getSensorOrientation() throws JposException {
        return 0;
    }
    
    @Override
    public void setSensorOrientation(int orientation) throws JposException {
    }
    
    @Override
    public int getSensorType() throws JposException {
        return 0;
    }
    
    @Override
    public void setSensorType(int type) throws JposException {
    }
    
    @Override
    public int getSensorWidth() throws JposException {
        return 0;
    }
    
    @Override
    public void beginEnrollCapture(byte[] referenceBIR, byte[] payload) throws JposException 
    {
    }
    
    @Override
    public void beginVerifyCapture() throws JposException 
    {
    }
    
    @Override
    public void checkHealth(int level) throws JposException 
    {
    }
    
    @Override
    public void claim(int timeout) throws JposException 
    {
    }
    
    @Override
    public void clearInput() throws JposException 
    {
    }
    
    @Override
    public void clearInputProperties() throws JposException 
    {
    }
    
    @Override
    public void close() throws JposException 
    {
    }
    
    @Override
    public void compareFirmwareVersion(String firmwareFileName, int[] result) throws JposException 
    {
    }
    
    @Override
    public void endCapture() throws JposException 
    {
    }
    
    @Override
    public void identify(int maxFARRequested, int maxFRRRequested, boolean FARPrecedence, byte[][] referenceBIRPopulation, int[][] candidateRanking, int timeout) throws JposException 
    {
    }
    
    @Override
    public void identifyMatch(int maxFARRequested, int maxFRRRequested, boolean FARPrecedence, byte[] sampleBIR, byte[][] referenceBIRPopulation, int[][] candidateRanking) throws JposException 
    {
    }
    
    @Override
    public void processPrematchData(byte[] capturedBIR, byte[] prematchDataBIR, byte[][] processedBIR) throws JposException 
    {
    }
    
    @Override
    public void release() throws JposException 
    {
    }
    
    @Override
    public void resetStatistics(String statisticsBuffer) throws JposException 
    {
    }
    
    @Override
    public void retrieveStatistics(String[] statisticsBuffer) throws JposException 
    {
    }
    
    @Override
    public void updateFirmware(String firmwareFileName) throws JposException 
    {
    }
    
    @Override
    public void updateStatistics(String statisticsBuffer) throws JposException 
    {
    }
    
    @Override
    public void verify(int maxFARRequested, int maxFRRRequested, boolean FARPrecedence, byte[] referenceBIR, byte[][] adaptedBIR, boolean[] result, int[] FARAchieved, int[] FRRAchieved, byte[][] payload, int timeout) throws JposException 
    {
    }
    
    @Override
    public void verifyMatch(int maxFARRequested, int maxFRRRequested, boolean FARPrecedence, byte[] sampleBIR, byte[] referenceBIR, byte[][] adaptedBIR, boolean[] result, int[] FARAchieved, int[] FRRAchieved, byte[][] payload) throws JposException 
    {
    }
}
