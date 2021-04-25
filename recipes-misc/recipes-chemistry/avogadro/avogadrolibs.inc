SUMMARY = "Chemistry library"
DESCRIPTION = "Avogadro libraries provide 3D rendering, visualization, analysis and data processing useful in computational chemistry, molecular modeling, bioinformatics, materials science, and related areas"
HOMEPAGE = "http://openchemistry.org/avogadro2"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=68485d31f72dbb8611179b6c7515617b"

inherit cmake_qt5 python3native

PV = "1.93.1"
SRC_URI = "git://github.com/OpenChemistry/avogadrolibs.git"
SRCREV = "4f1b21de000046c04a39829063c6416fbd70922b"
S = "${WORKDIR}/git"
