# Change Log for javapos-controls

## 1.15.0 Release

- incorporated outstanding changes from UnifiedPOS version 1.14.1 regarding _Electronic Value Reader/Writer_; solves GH issue #6
- made implementation UnifiedPOS version 1.15 compliant; solves GH issue #8 
- internal improvements: replacing Vector based implementation for listener list by an ArrayList based one, get rid of compiler warnings 
- added `getGateStatus` to _Gate_ which was missing since version 1.12 where it was misspelled as `getGetStatus`

## 1.14.2 Maintenance Release

- **Major Change**: requires Java 8 runtime (cannot be marked as major version change accordingly as major and minor version is aligned to UnifiedPOS version)
- publishes to MavenCentral only, not Bintray (as Bintray has been shut down)

## 1.14.1 Maintenance Release

This release solves the GH issues #1, #2, and #3.

In particular the device controls for ElectronicValueRW and Scale has been adapted.

This release requires javapos-contracts-1.14.3 to compile.

## 1.14.0 Release

This release corresponds to JavaPOS version 1.14 containing the device control reference implementation as provided by

- http://javapos.com/downloads/JavaPOS-1.14.0-Source-20131024.zip

In this release

- new event concept of TransitionEvent has been added for ElectronicValueRW
- new properties and methods for ElectronicValueRW, Scale, and Scanner has been added

## 1.13.5 Maintenance Release

This release corresponds to JavaPOS version 1.13.5 containing the device control reference implementation as provided by

- http://javapos.com/downloads/JavaPOS-1.13.5-Source-20131024.zip

In this release the following changes has been done

- backward correction to Belt 1.12: corrected return types of getCapSpeedStepsBackward() and getCapSpeedStepsForward(); was boolean, but should have been int
- Cat: added missing property OutputID
- ImageScanner: added implementation to control making it a non-empty implementation
- MSR: added new retrieveDeviceAuthenticationData with correct parameter type; old method left in place for compatibility
- POSPrinter: re-added dropped, misspelled slip cartridge constant for backwards compatibility

## 1.13.0 Release

This release corresponds to JavaPOS version 1.13 containing the device control reference implementation as provided by

- http://javapos.com/downloads/JavaPOS-1.13.0-Source-20090901.zip

In this release

- added new properties or methods to POSPrinter, Scale, ToneIndicator


## 1.12.2 Maintenance Release

This release corresponds to JavaPOS version 1.12 containing the device control reference implementation as provided by

- http://javapos.com/downloads/JavaPOS-1.12.2-Source-20080914.zip

In this release

- categories Belt, Gate, ItemDispenser, Lights RFIDScanner has been added
- backward correction for typo in CashChanger 1.11
- significant enhancement for MSR regarding authentication and encryption

## 1.11.0 Release

This release corresponds to JavaPOS version 1.11 containing the device control reference implementation as provided by

- http://javapos.com/downloads/JavaPOS-1.11.0-Source-20071101.zip (link on javapos.com is wrong but this file may be downloaded)

In this release categories

- BillAcceptor, and
- BillDispenser

has been added.

## 1.10.0 Release

This release corresponds to JavaPOS version 1.10 containing the device control reference implementation as provided by

- http://javapos.com/downloads/JavaPOS-1.10-Source-20060208.zip

For details how the content is built as part from the original archives, see javapos/README.md.

In this release the device categories

- Biometrics
- ElectronicJournal

has been added.

*For older releases see https://github.com/JavaPOSWorkingGroup/javapos-controls/releases*