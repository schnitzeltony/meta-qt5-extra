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

SRC_URI[md5sum] = "78b3f85680b2a47ebd7fdbf033823750"
SRC_URI[sha256sum] = "f323efb96a809dc9e572a0e68e04c4f485fc27f9ae65ffa3988830e348151356"

FILES_${PN} += " \
    ${datadir}/kdevappwizard \
    ${OE_QMAKE_PATH_QML} \
"

RPROVIDES_${PN} += "kirigami"
RREPLACES_${PN} += "kirigami"
RCONFLICTS_${PN} += "kirigami"
