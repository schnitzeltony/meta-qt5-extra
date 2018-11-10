SUMMARY = "QtQuick plugins to build user interfaces based on the KDE UX guidelines"
LICENSE = "LGPLv2"
LIC_FILES_CHKSUM = "file://LICENSE.LGPL-2;md5=5f30f0716dfdd0d91eb439ebec522ec2"

inherit kde-kf5

# Is that true: We are depending on plasma-framework and are a tier2??
DEPENDS += " \
    kpackage-native \
    qtquickcontrols2 \
    qtsvg \
"

PV = "${KF5_VERSION}"

SRC_URI[md5sum] = "7308ffce8c900befea2c3fb4306d7083"
SRC_URI[sha256sum] = "375ec103d56a71ee3a5f43de1cfb4720fc33c125b2b2de545f9e563851c38c24"

FILES_${PN} += " \
    ${OE_QMAKE_PATH_QML} \
"

RPROVIDES_${PN} += "kirigami"
RREPLACES_${PN} += "kirigami"
RCONFLICTS_${PN} += "kirigami"
