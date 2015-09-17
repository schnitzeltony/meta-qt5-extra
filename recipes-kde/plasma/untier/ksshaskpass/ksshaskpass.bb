SUMMARY = "ssh-add helper that uses kwallet and kpassworddialog"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=393a5ca445f6965873eca0259a17f833 \
"

inherit kde-plasma

DEPENDS += " \
    kcoreaddons \
    ki18n \
    kwallet \
    kwidgetsaddons \
"

# REVISIT optionals
DEPENDS += " \
    kdoctools \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "c4921201f38136666e5dd1986166f131"
SRC_URI[sha256sum] = "a24840cdb02464268cf81b341f2daa3f9c8c3c45aad9a256a349954c2e3a57fa"
