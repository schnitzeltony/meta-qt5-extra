SUMMARY = "The LXQt desktop panel"
LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://LICENSE;md5=435ed639f84d4585d93824e7da3d85da"

inherit lxqt qt5-translation features_check pkgconfig

REQUIRED_DISTRO_FEATURES = "x11"

DEPENDS += " \
    libxcomposite \
    liblxqt \
    lxqt-globalkeys \
    libdbusmenu-qt5 \
    menu-cache \
    kwindowsystem \
"

SRCREV = "e1598971e17ec6a0b5ef125366ceab5f29a78d24"
PV = "0.17.1"

PACKAGECONFIG[cpu_plugin] = "-DCPULOAD_PLUGIN=Yes,-DCPULOAD_PLUGIN=No, libstatgrab"
PACKAGECONFIG[dom] = "-DDOM_PLUGIN=Yes,-DDOM_PLUGIN=No"
PACKAGECONFIG[mount_plugin] = "-DMOUNT_PLUGIN=Yes,-DMOUNT_PLUGIN=No, solid"
PACKAGECONFIG[networkmonitor_plugin] = "-DNETWORKMONITOR_PLUGIN=Yes,-DNETWORKMONITOR_PLUGIN=No, libstatgrab"
PACKAGECONFIG[sensor_plugin] = "-DSENSORS_PLUGIN=Yes,-DSENSORS_PLUGIN=No, lmsensors"
PACKAGECONFIG[sysstat_plugin] = "-DSYSSTAT_PLUGIN=Yes,-DSYSSTAT_PLUGIN=No, libsysstat"
PACKAGECONFIG[volume_alsa_plugin] = "-DVOLUME_USE_ALSA=Yes,-DVOLUME_USE_ALSA=No, alsa-lib"
PACKAGECONFIG[volume_pulse_plugin] = "-DVOLUME_USE_PULSEAUDIO=Yes,-DVOLUME_USE_PULSEAUDIO=No, pulseaudio, pavucontrol-qt"

PACKAGECONFIG ??= "cpu_plugin dom mount_plugin networkmonitor_plugin sensor_plugin sysstat_plugin volume_alsa_plugin volume_pulse_plugin"

FILES:${PN} += " \
    ${datadir}/lxqt/panel.conf \
    ${datadir}/lxqt/lxqt-panel/*.desktop \
    ${datadir}/desktop-directories \
"
