SUMMARY = "The LXQt desktop panel"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://LICENSE;md5=435ed639f84d4585d93824e7da3d85da"

inherit lxqt distro_features_check pkgconfig

REQUIRED_DISTRO_FEATURES = "x11"

DEPENDS += " \
    libxcomposite \
    liblxqt \
    lxqt-globalkeys \
    libdbusmenu-qt5 \
    menu-cache \
    kwindowsystem \
"

SRC_URI += " \
    file://0001-add-Qt5-X11Extras-to-QTX_LIBRARIES.patch \
"
SRCREV = "4b20a41f3442b121485664333f457ee9abc228b8"
PV = "0.12.0"

PACKAGECONFIG[cpu_plugin] = "-DCPULOAD_PLUGIN=Yes,-DCPULOAD_PLUGIN=No, libstatgrab"
PACKAGECONFIG[mount_plugin] = "-DMOUNT_PLUGIN=Yes,-DMOUNT_PLUGIN=No, solid"
PACKAGECONFIG[networkmonitor_plugin] = "-DNETWORKMONITOR_PLUGIN=Yes,-DNETWORKMONITOR_PLUGIN=No, libstatgrab"
PACKAGECONFIG[sensor_plugin] = "-DSENSORS_PLUGIN=Yes,-DSENSORS_PLUGIN=No, lmsensors"
PACKAGECONFIG[sysstat_plugin] = "-DSYSSTAT_PLUGIN=Yes,-DSYSSTAT_PLUGIN=No, libsysstat"
PACKAGECONFIG[volume_alsa_plugin] = "-DVOLUME_USE_ALSA=Yes,-DVOLUME_USE_ALSA=No, alsa-lib"
PACKAGECONFIG[volume_pulse_plugin] = "-DVOLUME_USE_PULSEAUDIO=Yes,-DVOLUME_USE_PULSEAUDIO=No, pulseaudio, pavucontrol-qt"

PACKAGECONFIG ??= "cpu_plugin mount_plugin networkmonitor_plugin sensor_plugin sysstat_plugin volume_alsa_plugin volume_pulse_plugin"

FILES_${PN} += " \
    ${datadir}/lxqt/lxqt-panel/*.desktop \
    ${datadir}/desktop-directories \
"
