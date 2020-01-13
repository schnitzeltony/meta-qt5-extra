SUMMARY = "Integration of Frameworks widgets in Qt Designer/Creator"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5-porting-aids

DEPENDS += "qttools kcoreaddons kconfig kdoctools"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "af7ad91f84f9c642231d29f8d2270627"
SRC_URI[sha256sum] = "a7f9c530d8c7d214a176ee381541bd45f3a000a3e86404040b11f1394912d40b"
