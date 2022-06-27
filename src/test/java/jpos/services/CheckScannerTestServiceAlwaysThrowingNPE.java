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
 * JavaPOS Device Service class, intended to be used for testing purposes in CheckScannerTest.
 *
 */
public final class CheckScannerTestServiceAlwaysThrowingNPE implements jpos.services.CheckScannerService115, JposServiceInstance {
    
    private JposEntry configuration;
    
    @Override
    public int getDeviceServiceVersion() throws JposException {
        if (configuration.hasPropertyWithName("returnVersionTooLarge"))
            return 1016000;
        else if (configuration.hasPropertyWithName("throwingNPEOnGetDSVersion"))
            throw new NullPointerException();
        else
            return 1015000;
    }
    
    @Override
    public int getState() throws JposException {
        return JposConst.JPOS_S_IDLE;
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
    public void directIO(int command, int[] data, Object object) throws JposException 
    {
        throw new NullPointerException();
    }
    
    
    @Override
    public boolean getAutoDisable() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setAutoDisable(boolean autoDisable) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapAutoContrast() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapAutoGenerateFileID() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapAutoGenerateImageTagData() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapAutoSize() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getCapColor() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapCompareFirmwareVersion() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapConcurrentMICR() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapContrast() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapDefineCropArea() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getCapImageFormat() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapImageTagData() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapMICRDevice() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getCapPowerReporting() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapStatisticsReporting() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapStoreImageFiles() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapUpdateFirmware() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapUpdateStatistics() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapValidationDevice() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public String getCheckHealthText() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getClaimed() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getColor() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setColor(int nColor) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getConcurrentMICR() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setConcurrentMICR(boolean bConcurrentMICR) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getContrast() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setContrast(int contrast) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getCropAreaCount() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getDataCount() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getDataEventEnabled() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setDataEventEnabled(boolean dataEventEnabled) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getDeviceEnabled() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setDeviceEnabled(boolean deviceEnabled) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public String getDeviceServiceDescription() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getDocumentHeight() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setDocumentHeight(int nDocumentHeight) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getDocumentWidth() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setDocumentWidth(int nDocumentWidth) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public String getFileID() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setFileID(String sFileID) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getFileIndex() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setFileIndex(int nFileIndex) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getFreezeEvents() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setFreezeEvents(boolean freezeEvents) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public byte[] getImageData() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getImageFormat() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setImageFormat(int nImageFormat) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getImageMemoryStatus() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public String getImageTagData() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setImageTagData(String sImageTagData) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getMapMode() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setMapMode(int nMapMode) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getMaxCropAreas() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public String getPhysicalDeviceDescription() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public String getPhysicalDeviceName() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getPowerNotify() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setPowerNotify(int powerNotify) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getPowerState() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getQuality() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setQuality(int nQuality) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public String getQualityList() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getRemainingImagesEstimate() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void beginInsertion(int timeout) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void beginRemoval(int timeout) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void checkHealth(int level) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void claim(int timeout) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void clearImage(int by) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void clearInput() throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void clearInputProperties() throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void close() throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void compareFirmwareVersion(String firmwareFileName, int[] result) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void defineCropArea(int cropAreaID, int x, int y, int cx, int cy) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void endInsertion() throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void endRemoval() throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void release() throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void resetStatistics(String statisticsBuffer) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void retrieveImage(int cropAreaID) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void retrieveMemory(int by) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void retrieveStatistics(String[] statisticsBuffer) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void storeImage(int by) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void updateFirmware(String firmwareFileName) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void updateStatistics(String statisticsBuffer) throws JposException 
    {
        throw new NullPointerException();
    }
}
