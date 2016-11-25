SUMMARY = "Hawaii desktop environment shell"
LICENSE = "GPLv2 & LGPLv2"
LIC_FILES_CHKSUM = " \
	file://LICENSE.GPLv2;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
	file://LICENSE.LGPLv2.1;md5=4fbd65380cdd255951079008b364516c \
"

inherit hawaii systemd pythonnative distro_features_check

REQUIRED_DISTRO_FEATURES = "wayland"

SRC_URI += " \
    file://0001-find-host-s-git.patch \
"
SRCREV = "d02a209082819e3bfa3edd167328b4ed52ebf6e1"
PV = "0.8.0+git${SRCPV}"

S = "${WORKDIR}/git"

DEPENDS += " \
    qtwayland-native \
    wayland \
    libqtxdg \
    solid \
    libhawaii \
    greenisland \
"

# REVISIT optionals
DEPENDS += " \
    alsa-lib \
    pulseaudio \
"

EXTRA_OECMAKE += " \
    -DSYSTEMD_USER_UNIT_DIR=${systemd_system_unitdir} \
"

PACKAGECONFIG[nm_qt] = "-DENABLE_NETWORK_MANAGER=ON,-DENABLE_NETWORK_MANAGER=OFF,networkmanager-qt modemmanager-qt"
PACKAGECONFIG ??= "nm_qt"

SYSTEMD_SERVICE_${PN} = "hawaii.service"

# for starter scripts
RDEPENDS_${PN} = "qttools-tools qtwayland-plugins"

# REVISIT optionals
RRECOMMENDS_${PN} += " \
    fluid \
    hawaii-wallpapers \
    hawaii-icon-theme \
"

FILES_${PN} += " \
    ${datadir} \
    ${systemd_unitdir} \
    ${OE_QMAKE_PATH_QML} \
"
