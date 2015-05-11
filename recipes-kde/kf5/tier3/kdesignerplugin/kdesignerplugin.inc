SUMMARY = "Integration of Frameworks widgets in Qt Designer/Creator"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
	file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5

DEPENDS += "qttools kcoreaddons kconfig kdoctools"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "db161b4bf53ef14171b587ffc448a61c"
SRC_URI[sha256sum] = "f566f69aa3de4097bed4fec0fbd2b82584af2bab874502b386755d586c9f02fd"
