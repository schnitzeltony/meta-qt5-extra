SUMMARY = "An alternative session manager ported from the original razor-session"
LICENSE = "LGPL-2.1-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=435ed639f84d4585d93824e7da3d85da"

inherit lxqt qt5-translation features_check

REQUIRED_DISTRO_FEATURES = "x11"

DEPENDS += "procps liblxqt kwindowsystem"

SRC_URI += "file://0001-do-not-check-for-xdg-udser-dirs-at-build-time-it-is-.patch"
SRCREV = "27b7dbd9ec5e689165b99a1f09a98fb91a9fa8c4"
PV = "1.1.0"

FILES:${PN} += " \
    ${datadir}/lxqt/*.conf \
    ${datadir}/xsessions \
    ${datadir}/kdm \
"

RDEPENDS:${PN} += "xdg-user-dirs"
