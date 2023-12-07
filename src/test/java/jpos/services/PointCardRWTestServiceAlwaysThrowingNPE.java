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
 * JavaPOS Device Service class, intended to be used for testing purposes in PointCardRWTest.
 *
 */
public final class PointCardRWTestServiceAlwaysThrowingNPE implements jpos.services.PointCardRWService116, JposServiceInstance {
    
    private JposEntry configuration;
    
    @Override
    public int getDeviceServiceVersion() throws JposException {
        if (configuration.hasPropertyWithName("returnVersionTooLarge"))
            return 1017000;
        else if (configuration.hasPropertyWithName("throwingNPEOnGetDSVersion"))
            throw new NullPointerException();
        else
            return 1016000;
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
    public boolean getCapBold() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getCapCardEntranceSensor() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getCapCharacterSet() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapCleanCard() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapClearPrint() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapCompareFirmwareVersion() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapDhigh() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapDwide() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapDwideDhigh() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapItalic() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapLeft90() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapMapCharacterSet() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getCapPowerReporting() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapPrint() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapPrintMode() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapRight90() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapRotate180() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapStatisticsReporting() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getCapTracksToRead() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getCapTracksToWrite() throws JposException {
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
    public int getCardState() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getCharacterSet() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setCharacterSet(int charSet) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public String getCharacterSetList() throws JposException {
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
    public String getFontTypeFaceList() throws JposException {
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
    public int getLineChars() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setLineChars(int lineChars) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public String getLineCharsList() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getLineHeight() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setLineHeight(int lineHeight) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getLineSpacing() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setLineSpacing(int lineSpacing) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getLineWidth() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getMapCharacterSet() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setMapCharacterSet(boolean mapCharacterSet) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getMapMode() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setMapMode(int mapMode) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getMaxLines() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getOutputID() throws JposException {
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
    public int getPrintHeight() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getReadState1() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getReadState2() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getRecvLength1() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getRecvLength2() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getSidewaysMaxChars() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getSidewaysMaxLines() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public String getTrack1Data() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public String getTrack2Data() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public String getTrack3Data() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public String getTrack4Data() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public String getTrack5Data() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public String getTrack6Data() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getTracksToRead() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setTracksToRead(int tracksToRead) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getTracksToWrite() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setTracksToWrite(int tracksToWrite) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public String getWrite1Data() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setWrite1Data(String data) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public String getWrite2Data() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setWrite2Data(String data) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public String getWrite3Data() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setWrite3Data(String data) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public String getWrite4Data() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setWrite4Data(String data) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public String getWrite5Data() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setWrite5Data(String data) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public String getWrite6Data() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setWrite6Data(String data) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getWriteState1() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getWriteState2() throws JposException {
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
    public void cleanCard() throws JposException 
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
    public void clearOutput() throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void clearPrintWrite(int kind, int hPosition, int vPosition, int width, int height) throws JposException 
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
    public void printWrite(int kind, int hPosition, int vPosition, String data) throws JposException 
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
    public void retrieveStatistics(String[] statisticsBuffer) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void rotatePrint(int rotation) throws JposException 
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
    
    @Override
    public void validateData(String data) throws JposException 
    {
        throw new NullPointerException();
    }
}
