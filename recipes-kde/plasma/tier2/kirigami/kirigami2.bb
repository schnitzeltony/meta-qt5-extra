SUMMARY = "QtQuick plugins to build user interfaces based on the KDE UX guidelines"
LICENSE = "LGPLv2"
LIC_FILES_CHKSUM = "file://LICENSE.LGPL-2;md5=5f30f0716dfdd0d91eb439ebec522ec2"

# not yet in plasma
inherit kde-base

# Is that true: We are depending on plasma-framework and are a tier2??
DEPENDS += " \
    plasma-framework \
"

PV = "2.1.1"

SRC_URI = "${KDE_MIRROR}/stable/${BPN}/${BPN}-${PV}.tar.xz"
SRC_URI[md5sum] = "f25e9dc6df1466f69b72ef8d70b034a6"
SRC_URI[sha256sum] = "ea3796058f302dabf21b7c58a05e543da5d7407414a9001d26d4318962a872ad"

FILES_${PN} += " \
    ${OE_QMAKE_PATH_QML} \
"

RPROVIDES_${PN} += "kirigami"
RREPLACES_${PN} += "kirigami"
RCONFLICTS_${PN} += "kirigami"
