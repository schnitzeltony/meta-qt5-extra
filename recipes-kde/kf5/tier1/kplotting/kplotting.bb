SUMMARY = "Lightweight plotting framework"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "e40dbdb97b7aa82843a3351ae5838ad6"
SRC_URI[sha256sum] = "2a4387f748614f005cf67e549b9466c6eed52589ac58297857ba6a0be92c32ee"

DEPENDS += "qttools"

FILES_${PN} += "${OE_QMAKE_PATH_PLUGINS}/designer"
