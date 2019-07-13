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

SRC_URI[md5sum] = "a324faf4223316f6bd92973d2efdaa4e"
SRC_URI[sha256sum] = "f016481d393041513dda11345e9ee84723587fa4be9f17391ed1a5868477e153"

FILES_${PN} += " \
    ${OE_QMAKE_PATH_QML} \
"

RPROVIDES_${PN} += "kirigami"
RREPLACES_${PN} += "kirigami"
RCONFLICTS_${PN} += "kirigami"
