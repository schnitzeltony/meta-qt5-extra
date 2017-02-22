SUMMARY = "Integration of Frameworks widgets in Qt Designer/Creator"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5

DEPENDS += "qttools kcoreaddons kconfig kdoctools"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "89a054526209180e02b87b30b8766f5f"
SRC_URI[sha256sum] = "5d3476f1693726e1dc17c67e9fdbfc505caf78547a6758306b4d6dd79003a1bc"
