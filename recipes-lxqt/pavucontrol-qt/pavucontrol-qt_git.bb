SUMMARY = "pavucontrol-qt is the Qt port of pulseaudio volume control pavucontrol"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=751419260aa954499f7abaabaa882bbe"

inherit lxqt

DEPENDS += "glib-2.0 liblxqt pulseaudio"

SRC_URI += "file://0001-CMakeLists-Remove-XdgUserDirs-requirement.patch"
SRCREV = "4ce124ce49071a97f9185a6e619608e8481a337a"
PV = "0.1.0"
