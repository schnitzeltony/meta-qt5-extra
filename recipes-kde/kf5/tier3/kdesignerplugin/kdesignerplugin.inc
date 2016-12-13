SUMMARY = "Integration of Frameworks widgets in Qt Designer/Creator"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5

DEPENDS += "qttools kcoreaddons kconfig kdoctools"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "36dbaae8bca4b6465a82984801a0a42b"
SRC_URI[sha256sum] = "cf0b6ad6d996ff460447c83d382188c10eb01a9ff1e8532866e13050f389a807"
