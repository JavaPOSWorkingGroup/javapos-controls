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

/**
 * JavaPOS Device Service class, intended to be used for testing purposes in ElectronicValueRWTest.
 *
 */
public final class ElectronicValueRWTestService114 implements jpos.services.ElectronicValueRWService114, JposServiceInstance {
    
    private JposEntry configuration;
    
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
    }

    @Override
    public void deleteInstance() throws JposException {
        // intentionally left empty
    }

    
    @Override
    public String getAccountNumber() throws JposException {
        return "";
    }
    
    @Override
    public String getAdditionalSecurityInformation() throws JposException {
        return "";
    }
    
    @Override
    public void setAdditionalSecurityInformation(String addSecInfo) throws JposException {
    }
    
    @Override
    public long getAmount() throws JposException {
        return 0;
    }
    
    @Override
    public void setAmount(long amount) throws JposException {
    }
    
    @Override
    public String getApprovalCode() throws JposException {
        return "";
    }
    
    @Override
    public void setApprovalCode(String approvalCode) throws JposException {
    }
    
    @Override
    public boolean getAsyncMode() throws JposException {
        return true;
    }
    
    @Override
    public void setAsyncMode(boolean asyncMode) throws JposException {
    }
    
    @Override
    public boolean getAutoDisable() throws JposException {
        return true;
    }
    
    @Override
    public void setAutoDisable(boolean autoDisable) throws JposException {
    }
    
    @Override
    public long getBalance() throws JposException {
        return 0;
    }
    
    @Override
    public long getBalanceOfPoint() throws JposException {
        return 0;
    }
    
    @Override
    public boolean getCapActivateService() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapAddValue() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapCancelValue() throws JposException {
        return true;
    }
    
    @Override
    public int getCapCardSensor() throws JposException {
        return 0;
    }
    
    @Override
    public boolean getCapCompareFirmwareVersion() throws JposException {
        return true;
    }
    
    @Override
    public int getCapDetectionControl() throws JposException {
        return 0;
    }
    
    @Override
    public boolean getCapElectronicMoney() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapEnumerateCardServices() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapIndirectTransactionLog() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapLockTerminal() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapLogStatus() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapMediumID() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapPINDevice() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapPoint() throws JposException {
        return true;
    }
    
    @Override
    public int getCapPowerReporting() throws JposException {
        return 0;
    }
    
    @Override
    public boolean getCapRealTimeData() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapStatisticsReporting() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapSubtractValue() throws JposException {
        return true;
    }
    
    @Override
    public boolean CapTrainingMode() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapTransaction() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapTransactionLog() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapUnlockTerminal() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapUpdateFirmware() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapUpdateKey() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapUpdateStatistics() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapVoucher() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapWriteValue() throws JposException {
        return true;
    }
    
    @Override
    public String getCardServiceList() throws JposException {
        return "";
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
    public String getCurrentService() throws JposException {
        return "";
    }
    
    @Override
    public void setCurrentService(String currentService) throws JposException {
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
    public boolean getDetectionControl() throws JposException {
        return true;
    }
    
    @Override
    public void setDetectionControl(boolean detectionControl) throws JposException {
    }
    
    @Override
    public int getDetectionStatus() throws JposException {
        return 0;
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
    public String getExpirationDate() throws JposException {
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
    public String getLastUsedDate() throws JposException {
        return "";
    }
    
    @Override
    public int getLogStatus() throws JposException {
        return 0;
    }
    
    @Override
    public String getMediumID() throws JposException {
        return "";
    }
    
    @Override
    public void setMediumID(String mediumID) throws JposException {
    }
    
    @Override
    public int getOutputID() throws JposException {
        return 0;
    }
    
    @Override
    public int getPINEntry() throws JposException {
        return 0;
    }
    
    @Override
    public void setPINEntry(int pinEntry) throws JposException {
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
    public long getPoint() throws JposException {
        return 0;
    }
    
    @Override
    public void setPoint(long point) throws JposException {
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
    public String getReaderWriterServiceList() throws JposException {
        return "";
    }
    
    @Override
    public int getSequenceNumber() throws JposException {
        return 0;
    }
    
    @Override
    public long getSettledAmount() throws JposException {
        return 0;
    }
    
    @Override
    public long getSettledPoint() throws JposException {
        return 0;
    }
    
    @Override
    public int getTrainingModeState() throws JposException {
        return 0;
    }
    
    @Override
    public void setTrainingModeState(int trainingModeState) throws JposException {
    }
    
    @Override
    public String getTransactionLog() throws JposException {
        return "";
    }
    
    @Override
    public String getVoucherID() throws JposException {
        return "";
    }
    
    @Override
    public void setVoucherID(String voucherID) throws JposException {
    }
    
    @Override
    public String getVoucherIDList() throws JposException {
        return "";
    }
    
    @Override
    public void setVoucherIDList(String voucherIDList) throws JposException {
    }
    
    @Override
    public void accessLog(int sequenceNumber, int type, int timeout) throws JposException 
    {
    }
    
    @Override
    public void activateService(int[] data, Object[] obj) throws JposException 
    {
    }
    
    @Override
    public void addValue(int sequenceNumber, int timeout) throws JposException 
    {
    }
    
    @Override
    public void beginDetection(int type, int timeout) throws JposException 
    {
    }
    
    @Override
    public void beginRemoval(int timeout) throws JposException 
    {
    }
    
    @Override
    public void cancelValue(int sequenceNumber, int timeout) throws JposException 
    {
    }
    
    @Override
    public void captureCard() throws JposException 
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
    public void clearOutput() throws JposException 
    {
    }
    
    @Override
    public void clearParameterInformation() throws JposException 
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
    public void directIO(int command, int[] data, Object object) throws JposException 
    {
    }
    
    @Override
    public void endDetection() throws JposException 
    {
    }
    
    @Override
    public void endRemoval() throws JposException 
    {
    }
    
    @Override
    public void enumerateCardServices() throws JposException 
    {
    }
    
    @Override
    public void lockTerminal() throws JposException 
    {
    }
    
    @Override
    public void queryLastSuccessfulTransactionResult() throws JposException 
    {
    }
    
    @Override
    public void readValue(int sequenceNumber, int timeout) throws JposException 
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
    public void retrieveResultInformation(String name, String[] value) throws JposException 
    {
    }
    
    @Override
    public void retrieveStatistics(String[] statisticsBuffer) throws JposException 
    {
    }
    
    @Override
    public void setParameterInformation(String name, String value) throws JposException 
    {
    }
    
    @Override
    public void subtractValue(int sequenceNumber, int timeout) throws JposException 
    {
    }
    
    @Override
    public void transactionAccess(int control) throws JposException 
    {
    }
    
    @Override
    public void unlockTerminal() throws JposException 
    {
    }
    
    @Override
    public void updateFirmware(String firmwareFileName) throws JposException 
    {
    }
    
    @Override
    public void updateKey(int[] data, Object[] obj) throws JposException 
    {
    }
    
    @Override
    public void updateStatistics(String statisticsBuffer) throws JposException 
    {
    }
    
    @Override
    public void writeValue(int sequenceNumber, int timeout) throws JposException 
    {
    }
}
