SUMMARY = "Common files for LXQt"
LICENSE = "CC-BY-SA-3.0"
LIC_FILES_CHKSUM = "file://README.md;;beginline=8;endline=8;md5=fe89974151c809631428df2e880f46d4"

inherit lxqt

DEPENDS += "liblxqt"

SRCREV = "e400c79738b7251526d5e5317926f30a70d61801"
PV = "0.9.0"

FILES_${PN} += " \
    ${datadir} \
"
