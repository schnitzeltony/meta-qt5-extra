SUMMARY = "KSYSGUARD"
LICENSE = "GPL-2.0 & GFDL-1.2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5c213a7de3f013310bd272cdb6eb7a24 \
    file://COPYING.DOC;md5=ad1419ecc56e060eccf8184a87c4285f \
"

inherit kde-plasma gettext mime-xdg

DEPENDS += " \
    kauth-native \
    kconfig-native \
    kcoreaddons \
    kcoreaddons-native \
    kdoctools-native \
    ki18n \
    kitemviews \
    knewstuff \
    kconfig \
    kiconthemes \
    kdelibs4support \
    libksysguard \
"

# REVISIT optionals
DEPENDS += "lmsensors"

PV = "${PLASMA_VERSION}"
SRC_URI[sha256sum] = "32f5227b2c1f91cd64fcee6b401209582cfffb16e2b015c6d6513e9f4d1dab35"

# do not move so-libs to -dev package
FILES_SOLIBSDEV = ""

FILES_${PN} += " \
    ${datadir}/dbus-1 \
    ${datadir}/icons \
    ${datadir}/k*5 \
    ${datadir}/knsrcfiles \
    ${libdir}/libkdeinit5_ksysguard.so \
    ${libdir}/libksgrdbackend.so \
    ${OE_QMAKE_PATH_PLUGINS}/ksysguard \
"
