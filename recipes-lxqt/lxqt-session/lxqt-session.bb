SUMMARY = "An alternative session manager ported from the original razor-session"
LICENSE = "LGPL-2.1-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=435ed639f84d4585d93824e7da3d85da"

inherit lxqt qt5-translation features_check

REQUIRED_DISTRO_FEATURES = "x11"

DEPENDS += " \
    qtxdg-tools-native \
    procps \
    liblxqt \
    kwindowsystem \
"

SRC_URI += "file://0001-do-not-check-for-xdg-udser-dirs-at-build-time-it-is-.patch \
            file://adopt-api-changes-for-procps-ng.patch"
SRCREV = "b7c4029438091cecff0fe01ac0cb54b2f405ef80"
PV = "1.4.0"

FILES:${PN} += " \
    ${datadir}/lxqt/*.conf \
    ${datadir}/xsessions \
    ${datadir}/kdm \
"

RDEPENDS:${PN} += "xdg-user-dirs"
