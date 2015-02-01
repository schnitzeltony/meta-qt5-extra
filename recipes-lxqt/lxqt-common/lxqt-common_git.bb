SUMMARY = "Common files for LXQt"
LICENSE = "CC-BY-SA-3.0"
LIC_FILES_CHKSUM = "file://README.md;;beginline=8;endline=8;md5=fe89974151c809631428df2e880f46d4"

inherit lxqt

DEPENDS += "liblxqt"

SRCREV = "7db79ae08a53e8578ce24846686fc8a0c6048b9f"
PV = "0.8.0+git${SRCPV}"

FILES_${PN} += " \
    ${datadir} \
"
