SUMMARY = "The LXQt desktop panel"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=0964c689fcf4c21c6797ea87408416b6"

inherit lxqt

DEPENDS += "liblxqt lxqt-globalkeys kwindowsystem kguiaddons"

SRCREV = "ae7100b2eb88de9b80f62b93d6e98b2941021744"
PV = "0.8.0+git${SRCPV}"

PACKAGECONFIG[cpu_plugin] = "-DCPULOAD_PLUGIN=Yes,-DCPULOAD_PLUGIN=No, libstatgrab"
PACKAGECONFIG[mount_plugin] = "-DMOUNT_PLUGIN=Yes,-DMOUNT_PLUGIN=No, liblxqt-mount"
PACKAGECONFIG[networkmonitor_plugin] = "-DNETWORKMONITOR_PLUGIN=Yes,-DNETWORKMONITOR_PLUGIN=No, libstatgrab"
PACKAGECONFIG[sensor_plugin] = "-DSENSORS_PLUGIN=Yes,-DSENSORS_PLUGIN=No, lmsensors"
PACKAGECONFIG[sysstat_plugin] = "-DSYSSTAT_PLUGIN=Yes,-DSYSSTAT_PLUGIN=No, libsysstat"
PACKAGECONFIG[volume_alsa_plugin] = "-DVOLUME_USE_ALSA=Yes,-DVOLUME_USE_ALSA=No, alsa-lib"
PACKAGECONFIG[volume_pulse_plugin] = "-DVOLUME_USE_PULSEAUDIO=Yes,-DVOLUME_USE_PULSEAUDIO=No, pulseaudio"

PACKAGECONFIG ??= "cpu_plugin mount_plugin networkmonitor_plugin sensor_plugin sysstat_plugin volume_alsa_plugin volume_pulse_plugin"

FILES_${PN} += "${datadir}/lxqt/lxqt-panel"
