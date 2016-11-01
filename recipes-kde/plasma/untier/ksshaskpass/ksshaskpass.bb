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
SRC_URI[md5sum] = "527fedb60d86c190afd82c9e9bde7280"
SRC_URI[sha256sum] = "72de4eb6adaadef5e4d30f10c22bd0aef1d5197070589f54d03b7983d7b76e4f"
