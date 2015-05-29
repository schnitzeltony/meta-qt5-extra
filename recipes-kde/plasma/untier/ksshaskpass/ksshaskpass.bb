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
SRC_URI[md5sum] = "91b4249fcf8b48631c927fda4796a654"
SRC_URI[sha256sum] = "a2a916b04808aaad781e79174bef1c60bb4cb6e3603fb95a696d1912d73eba45"
