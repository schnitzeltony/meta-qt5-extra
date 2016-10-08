SUMMARY = "QtQuick plugins to build user interfaces based on the KDE UX guidelines"
LICENSE = "LGPLv2"
LIC_FILES_CHKSUM = "file://LICENSE.LGPL-2;md5=5f30f0716dfdd0d91eb439ebec522ec2"

# not yet in plasma
inherit kde-base

# Is that true: We are depending on plasma-framework and are a tier2??
DEPENDS += " \
    plasma-framework \
"

SRC_URI = "${KDE_MIRROR}/stable/${BPN}/${BPN}-${PV}.tar.xz"
SRC_URI[md5sum] = "04491f0180ba69cea095e9ed61f76c9f"
SRC_URI[sha256sum] = "6677af0c486a4c9cfefe74a0951e85dad53435010031bf2b7fcdf9c5df6b3edd"

FILES_${PN} += " \
    ${OE_QMAKE_PATH_QML} \
"
