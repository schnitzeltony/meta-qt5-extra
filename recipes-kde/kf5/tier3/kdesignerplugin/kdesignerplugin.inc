SUMMARY = "Integration of Frameworks widgets in Qt Designer/Creator"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5

DEPENDS += "qttools kcoreaddons kconfig kdoctools"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "f69a1df2aba21090aa0a441861e053a2"
SRC_URI[sha256sum] = "ea9444f44767f7451c655f06101f895b99fe655e14677505f3c3148811b704ba"
