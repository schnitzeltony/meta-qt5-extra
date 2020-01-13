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

SRC_URI[md5sum] = "0ef55ca68fb4d069745ea72d7466acaa"
SRC_URI[sha256sum] = "4e4abfeaa5e997de52076786dd0d314f178bc883b1b48a8b2cf37dd5979ac41b"

FILES_${PN} += " \
    ${datadir}/kdevappwizard \
    ${OE_QMAKE_PATH_QML} \
"

RPROVIDES_${PN} += "kirigami"
RREPLACES_${PN} += "kirigami"
RCONFLICTS_${PN} += "kirigami"
