SUMMARY = "Support for unit conversion"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5 gettext

DEPENDS += "ki18n"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "7275bf0827398aa5f0158c4ae30cb68b"
SRC_URI[sha256sum] = "65bfba8e88e2cf6de40e06ce24fe5f48948cc92f16ce78eb8538de532dcf36cb"
