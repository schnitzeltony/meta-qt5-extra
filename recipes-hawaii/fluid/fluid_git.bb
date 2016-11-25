SUMMARY = "Library for QtQuick applications"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = " \
    file://LICENSE.LGPLv21;md5=4fbd65380cdd255951079008b364516c \
"

inherit hawaii

PV = "0.8.0"

SRC_URI = "git://github.com/hawaii-desktop/${BPN}.git"
SRCREV = "ab6f40ddc7e38c7eb49e8afbe4ddaf2d13c49146"
S = "${WORKDIR}/git"

FILES_${PN} += "${OE_QMAKE_PATH_QML}"
