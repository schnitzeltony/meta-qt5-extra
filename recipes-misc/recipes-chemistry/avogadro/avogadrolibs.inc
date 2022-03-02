SUMMARY = "Chemistry library"
DESCRIPTION = "Avogadro libraries provide 3D rendering, visualization, analysis and data processing useful in computational chemistry, molecular modeling, bioinformatics, materials science, and related areas"
HOMEPAGE = "http://openchemistry.org/avogadro2"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=68485d31f72dbb8611179b6c7515617b"

inherit cmake_qt5 python3native

PV = "1.95.1"
SRC_URI = " \
    git://github.com/OpenChemistry/avogadrolibs.git;branch=master;protocol=https \
    git://github.com/openchemistry/molecules;branch=master;protocol=https;name=molecules;destsuffix=molecules \
    git://github.com/openchemistry/crystals;branch=master;protocol=https;name=crystals;destsuffix=crystals \
"
SRCREV = "11044b0bd7844a5241529e7f9c45ff6ed5ab22bf"
SRCREV_molecules = "b1e16c5dc6d15e72d30dd6c4fca31b2c12025efc"
SRCREV_crystals = "4b39c77ec1043cfb7a73e7b5dd51e24d36a95c44"


S = "${WORKDIR}/git"
