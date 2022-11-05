SUMMARY = "Adjust your monitor's gamma settings"
LICENSE = "GPL-2.0-or-later"
LIC_FILES_CHKSUM = " \
    file://LICENSES/GPL-2.0-or-later.txt;md5=fed54355545ffd980b814dab4a3b312c \
"

REQUIRED_DISTRO_FEATURES = "x11"

inherit kde-plasma features_check gettext

DEPENDS += " \
    kauth-native \
    kcoreaddons-native \
    kconfig-native kconfig \
    kdoctools-native \
    virtual/libx11 \
    kdelibs4support \
"

PV = "${PLASMA_VERSION}"
SRC_URI[sha256sum] = "8c9c5b9b8c40722ba35323b9a9dcc8de5ba3cac27f5f67a750071ea2ad6a7baa"

FILES:${PN} += " \
    ${datadir}/kgamma \
    ${datadir}/kservices5 \
    ${OE_QMAKE_PATH_PLUGINS} \
"

INSANE_SKIP:${PN} = "dev-so"
