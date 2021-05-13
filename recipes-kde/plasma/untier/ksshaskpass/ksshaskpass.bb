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
SRC_URI[sha256sum] = "a2f963a9991cbe639a63664a820b4c55c1bd75be6a209a8b439911ec4911f119"
