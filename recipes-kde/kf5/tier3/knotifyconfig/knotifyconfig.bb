SUMMARY = "Configuration system for KNotify"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5

DEPENDS += " \
    phonon \
    kcompletion \
    kconfig \
    ki18n \
    kio \
    kservice \
    kconfigwidgets \
    knotifications \
    kwidgetsaddons \
    kxmlgui \
"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "66f59c95d8f3ec05063377934a4b2e28"
SRC_URI[sha256sum] = "b83a40156ca8d7b9af1e213ae00358b643c41351e8e7fa7cf2e60cd09a848512"
