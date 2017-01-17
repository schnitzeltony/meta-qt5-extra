SUMMARY = "pavucontrol-qt is the Qt port of pulseaudio volume control pavucontrol"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=751419260aa954499f7abaabaa882bbe"

inherit lxqt

DEPENDS += "glib-2.0 liblxqt pulseaudio"

SRCREV = "16e2a518f84b6992954e67731111a12e625a9def"
PV = "0.2.0"
