SUMMARY = "Integration with su for elevated privileges"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
    file://COPYING.LIB;md5=2d5025d4aa3495befef8f17206a5b0a1 \
"

inherit kde-kf5 gettext

DEPENDS += " \
    kconfig-native \
    kcoreaddons \
    kcoreaddons-native \
    kservice \
    kpty \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "virtual/libx11", "", d)} \
"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "51573da6c3df446132500e83e0610dbc"
SRC_URI[sha256sum] = "e2e38bf4bf7cc0f2ffb16d2f677f36b930a32ced452a53379d983f6bd999cbdc"

FILES_${PN}-dbg += "${libdir}/kdesu/kf5/.debug"
