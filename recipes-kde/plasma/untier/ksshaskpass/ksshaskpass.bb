SUMMARY = "ssh-add helper that uses kwallet and kpassworddialog"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=393a5ca445f6965873eca0259a17f833 \
"

inherit kde-plasma gettext

DEPENDS += " \
    kcoreaddons \
    kcoreaddons-native \
    ki18n \
    kwallet \
    kwidgetsaddons \
    kdoctools-native \
"

# REVISIT optionals
DEPENDS += " \
    kdoctools \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "09cd76828b7d2a33bf15404e48fcf275"
SRC_URI[sha256sum] = "647c870b4c82e7db6d5e09b2e368ee3ab083e537fd3f8ce9458e32d3aeee42c6"
