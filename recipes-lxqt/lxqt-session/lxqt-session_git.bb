SUMMARY = "An alternative session manager ported from the original razor-session"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://LICENSE;md5=435ed639f84d4585d93824e7da3d85da"

inherit lxqt distro_features_check

REQUIRED_DISTRO_FEATURES = "x11"

DEPENDS += "liblxqt kwindowsystem"

SRC_URI += "file://0001-do-not-check-for-xdg-udser-dirs-at-build-time-it-is-.patch"
SRCREV = "d85d4579d437ad5181f4e640323ab6ef5c7a13ac"
PV = "0.14.0"

FILES_${PN} += " \
    ${datadir}/lxqt/*.conf \
    ${datadir}/xsessions \
    ${datadir}/kdm \
"

RDEPENDS_${PN} += "xdg-user-dirs"
