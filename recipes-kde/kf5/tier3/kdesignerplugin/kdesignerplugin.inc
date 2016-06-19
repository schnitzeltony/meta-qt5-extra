SUMMARY = "Integration of Frameworks widgets in Qt Designer/Creator"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5

DEPENDS += "qttools kcoreaddons kconfig kdoctools"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "fe1ec30258eb149d21c9f649b72a8f1a"
SRC_URI[sha256sum] = "14aa080c3dbbbe60208d5b6262f0e17c5a1c943a7651c245d52e235898536509"
