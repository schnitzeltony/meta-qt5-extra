SUMMARY = "ssh-add helper that uses kwallet and kpassworddialog"
LICENSE = "GPL-2.0"
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
SRC_URI[sha256sum] = "da0e1b06673afb12789fd028f2d428d980b85912ceb5e715bc710f5edb9f8299"
