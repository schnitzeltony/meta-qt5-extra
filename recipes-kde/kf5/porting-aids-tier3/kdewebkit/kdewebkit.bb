SUMMARY = "KDE Integration for QtWebKit"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1"

inherit kde-kf5-porting-aids gettext

DEPENDS += " \
    qtwebkit \
    kauth-native \
    kconfig \
    kconfig-native \
    kcoreaddons \
    kcoreaddons-native \
    kio \
    kjobwidgets \
    kparts \
    kservice \
    kwallet \
    sonnet-native \
"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "20228596d127a21ccaa9db2567511b45"
SRC_URI[sha256sum] = "04b8b90734ddf6d5e72ffa69707d473e1d1f8605ba06d4ceca83f4a1d195c65d"

FILES_${PN} += "${libdir}/plugins"
